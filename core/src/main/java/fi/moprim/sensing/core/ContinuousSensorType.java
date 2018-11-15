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
 * Type of sensor data we can monitor continuously with a preferred sampling rate
 */
public enum ContinuousSensorType {
    ACCELEROMETER, // (uncalibrated if available)
    GYROSCOPE, // (uncalibrated if available)
    MAGNETOMETER, // (uncalibrated if available)
    LOCATION,
    PRESSURE,
    GRAVITY,
    AMBIENT_TEMPERATURE, //
    LIGHT,
    PROXIMITY
}

