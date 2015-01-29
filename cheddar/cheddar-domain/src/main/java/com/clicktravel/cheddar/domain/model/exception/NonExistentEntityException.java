/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.clicktravel.cheddar.domain.model.exception;

import com.clicktravel.cheddar.domain.model.Entity;
import com.clicktravel.cheddar.domain.model.EntityId;

public class NonExistentEntityException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NonExistentEntityException(final String message) {
        super(message);
    }

    public NonExistentEntityException(final EntityId entityId) {
        super("No entity found with id " + entityId.id());
    }

    public NonExistentEntityException(final Class<? extends Entity> entityClass, final EntityId entityId) {
        super("No entity of type " + entityClass.getSimpleName() + " with id " + entityId.id());
    }

}
