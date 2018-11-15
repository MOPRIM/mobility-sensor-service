/*
 * Copyright 2018 Moprim
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package fi.moprim.sensing.core;

/**
 * The interface for the sensor events of Moprim.
 * Created by mineraud on 03/07/17.
 */
public interface SensorEvent {

    /**
     * The UTC timestamp of the event in milliseconds
     * @return the UTC timestamp of the event in milliseconds
     */
    long getTimestamp();

    /**
     * Get the values return by the sensor
     * @return the values return by the sensor
     */
    double[] getValues();

    /**
     * Used only for the location
     * @return the provider if one set for the location event
     */
    String getProvider();
}

