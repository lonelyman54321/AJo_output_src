/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.Internal$ListAdapter$Converter;

class PerfSession$1
implements Internal$ListAdapter$Converter {
    public SessionVerbosity convert(Integer object) {
        int n3 = (Integer)object;
        if ((object = SessionVerbosity.forNumber(n3)) == null) {
            object = SessionVerbosity.SESSION_VERBOSITY_NONE;
        }
        return object;
    }
}

