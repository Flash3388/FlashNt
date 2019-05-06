package com.flash3388.util.nt;

import edu.wpi.first.networktables.NetworkTableEntry;

public class NtEntryMissingException extends RuntimeException {

    public NtEntryMissingException(NetworkTableEntry entry) {
        super(entry.getName());
    }
}
