package com.ducph.consoledrawing.service;

import com.ducph.consoledrawing.exception.InvalidEntityException;
import com.ducph.consoledrawing.model.Entity;

public interface CanvasService {

    void addEntity(Entity entity) throws InvalidEntityException;

    String render();
}
