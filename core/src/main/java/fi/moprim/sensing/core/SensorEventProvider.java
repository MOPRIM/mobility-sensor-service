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
 * An interface for sensor event providers
 * Created by mineraud on 30/05/17.
 */
public interface SensorEventProvider {
    void registerListener(ContinuousSensorType sensorType, SensorEventListener listener, double samplingFrequencyHz);
    void unregisterListener(ContinuousSensorType sensorType, SensorEventListener listener);
    void registerListener(OnChangeSensorType sensorType, SensorEventListener listener);
    void unregisterListener(OnChangeSensorType sensorType, SensorEventListener listener);
    void registerListener(OneShotSensorType sensorType, SensorEventListener listener);
    void unregisterListener(OneShotSensorType sensorType, SensorEventListener listener);
}

