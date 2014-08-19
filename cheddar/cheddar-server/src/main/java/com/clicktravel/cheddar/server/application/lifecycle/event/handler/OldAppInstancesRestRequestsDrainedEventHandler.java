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
package com.clicktravel.cheddar.server.application.lifecycle.event.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clicktravel.cheddar.server.application.configuration.ApplicationConfiguration;
import com.clicktravel.cheddar.server.application.lifecycle.LifecycleStatus;
import com.clicktravel.cheddar.server.application.lifecycle.LifecycleStatusHolder;
import com.clicktravel.cheddar.system.event.SystemEvent;
import com.clicktravel.cheddar.system.event.application.lifecycle.OldAppInstancesRestRequestsDrainedEvent;

@Component
public class OldAppInstancesRestRequestsDrainedEventHandler extends AbstractApplicationLifecycleEventHandler {

    @Autowired
    public OldAppInstancesRestRequestsDrainedEventHandler(final ApplicationConfiguration applicationConfiguration,
            final LifecycleStatusHolder lifecycleStatusHolder) {
        super(applicationConfiguration, lifecycleStatusHolder, LifecycleStatus.DRAINING_REQUESTS);
    }

    @Override
    public Class<? extends SystemEvent> getEventClass() {
        return OldAppInstancesRestRequestsDrainedEvent.class;
    }

    @Override
    protected void handleApplicationLifecycleEvent(final SystemEvent event) {
        // TODO Step 12 Start shutdown of high priority domain event handlers. Move to HALTING_HIGH_PRIORITY_EVENTS
        // state
    }

}
