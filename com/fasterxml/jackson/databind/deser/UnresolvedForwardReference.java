/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JsonMappingException;

public class UnresolvedForwardReference
extends JsonMappingException {
    private static final long serialVersionUID = 1L;

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return this;
    }
}

