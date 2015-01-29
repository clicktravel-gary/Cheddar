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
package com.clicktravel.cheddar.system.event.application.lifecycle;

import com.clicktravel.cheddar.system.event.AbstractSystemEvent;

/**
 * System event indicating all 'old' version application instances participating in a blue-green deployment have
 * finished processing REST requests.
 * <p>
 * This event is broadcast to all instances running the 'old' application version.
 */
public class OldAppInstancesRestRequestsDrainedEvent extends AbstractSystemEvent {

}
