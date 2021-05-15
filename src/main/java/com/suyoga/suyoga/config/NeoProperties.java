package com.suyoga.suyoga.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {

    @Value("${com.neo.title}")
    public String title;
    @Value("${com.neo.descr}")
    public String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NeoProperties{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
