/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

public class DataBufferResponse
extends Response
implements DataBuffer {
    public DataBufferResponse() {
    }

    public DataBufferResponse(AbstractDataBuffer abstractDataBuffer) {
        super((Result)((Object)abstractDataBuffer));
    }

    public final void close() {
        ((AbstractDataBuffer)((Object)this.getResult())).close();
    }

    public final Object get(int n3) {
        return ((AbstractDataBuffer)((Object)this.getResult())).get(n3);
    }

    public final int getCount() {
        return ((AbstractDataBuffer)((Object)this.getResult())).getCount();
    }

    public final Bundle getMetadata() {
        return ((AbstractDataBuffer)((Object)this.getResult())).getMetadata();
    }

    public final boolean isClosed() {
        return ((AbstractDataBuffer)((Object)this.getResult())).isClosed();
    }

    public final Iterator iterator() {
        return ((AbstractDataBuffer)((Object)this.getResult())).iterator();
    }

    public final void release() {
        ((AbstractDataBuffer)((Object)this.getResult())).release();
    }

    public final Iterator singleRefIterator() {
        return ((AbstractDataBuffer)((Object)this.getResult())).singleRefIterator();
    }
}

