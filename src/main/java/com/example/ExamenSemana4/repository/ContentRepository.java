package com.example.ExamenSemana4.repository;

import com.example.ExamenSemana4.entity.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContentRepository {

    @Autowired
    ContentRepositoryDao contentRepositoryDao;

    public List<Content> getContents() {
        return (List<Content>) contentRepositoryDao.findAll();
    }

    public void addContent(Content content) {
        contentRepositoryDao.save(content);
    }

    public Optional<Content> getCourseById(Integer id) {
        return contentRepositoryDao.findById(id);
    }

    public Content updateCourse(Integer id, Content content) {
        contentRepositoryDao.deleteById(id);
        return contentRepositoryDao.save(content);
    }

    public void deleteContent(Integer id) {
        contentRepositoryDao.deleteById(id);
    }
}
