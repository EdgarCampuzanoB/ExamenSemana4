package com.example.ExamenSemana4.controller;

import com.example.ExamenSemana4.entity.Content;
import com.example.ExamenSemana4.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    ContentRepository contentRepository;

    @GetMapping
    public List<Content> getContents(){
        return contentRepository.getContents();
    }

    @PostMapping("/newContent")
    public ResponseEntity<Content> addContent(@RequestBody Content content){
        contentRepository.addContent(content);
        return ResponseEntity.ok(content);
    }

    @GetMapping("/findContent/{id}")
    public Optional<Content> findContentByid(@PathVariable ("id") Integer id){
        return contentRepository.getCourseById(id);
    }

    @PutMapping("/updateContent/{id}")
    public ResponseEntity<Content> updateContent(@RequestBody Content content, @PathVariable ("id") Integer id){
        Content updateContent = contentRepository.updateCourse(id, content);
        if(updateContent == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(updateContent);
        }
    }

    @DeleteMapping("/deleteContent/{id}")
    public ResponseEntity<Object> deleteCourse(@PathVariable ("id") Integer id){
        contentRepository.deleteContent(id);
        return ResponseEntity.noContent().build();
    }
}
