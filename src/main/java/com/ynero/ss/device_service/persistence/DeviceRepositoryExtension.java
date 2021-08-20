package com.ynero.ss.device_service.persistence;

import com.ynero.ss.device_service.domain.Device;
import com.ynero.ss.device_service.domain.Port;

import java.util.UUID;

public interface DeviceRepositoryExtension {
    boolean updateSnapshot(Port port, UUID deviceId);
    Device[] getAllRelatedDevicesByPipelineIds(UUID pipelineId);
    Port addPort(Port port, UUID deviceId);
}
