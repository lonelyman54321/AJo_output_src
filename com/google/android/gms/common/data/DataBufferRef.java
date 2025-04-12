/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.CharArrayBuffer
 *  android.net.Uri
 */
package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public abstract class DataBufferRef {
    protected final DataHolder mDataHolder;
    protected int mDataRow;
    private int zaa;

    public DataBufferRef(DataHolder dataHolder, int n3) {
        this.mDataHolder = dataHolder = (DataHolder)Preconditions.checkNotNull(dataHolder);
        this.zaa(n3);
    }

    public void copyToBuffer(String string2, CharArrayBuffer charArrayBuffer) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        this.mDataHolder.zac(string2, n3, n4, charArrayBuffer);
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof DataBufferRef;
        if (bl2) {
            int n3;
            Integer n4;
            object = (DataBufferRef)object;
            Object object2 = ((DataBufferRef)object).mDataRow;
            bl2 = Objects.equal(object2, n4 = Integer.valueOf(n3 = this.mDataRow));
            if (bl2 && (bl2 = Objects.equal(object2 = Integer.valueOf(((DataBufferRef)object).zaa), n4 = Integer.valueOf(n3 = this.zaa))) && (object = ((DataBufferRef)object).mDataHolder) == (object2 = this.mDataHolder)) {
                return true;
            }
        }
        return false;
    }

    public boolean getBoolean(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.getBoolean(string2, n3, n4);
    }

    public byte[] getByteArray(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.getByteArray(string2, n3, n4);
    }

    public int getDataRow() {
        return this.mDataRow;
    }

    public double getDouble(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.zaa(string2, n3, n4);
    }

    public float getFloat(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.zab(string2, n3, n4);
    }

    public int getInteger(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.getInteger(string2, n3, n4);
    }

    public long getLong(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.getLong(string2, n3, n4);
    }

    public String getString(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.getString(string2, n3, n4);
    }

    public boolean hasColumn(String string2) {
        return this.mDataHolder.hasColumn(string2);
    }

    public boolean hasNull(String string2) {
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        return this.mDataHolder.hasNull(string2, n3, n4);
    }

    public int hashCode() {
        Integer n3 = this.mDataRow;
        Integer n4 = this.zaa;
        DataHolder dataHolder = this.mDataHolder;
        Object[] objectArray = new Object[]{n3, n4, dataHolder};
        return Objects.hashCode(objectArray);
    }

    public boolean isDataValid() {
        DataHolder dataHolder = this.mDataHolder;
        boolean bl2 = dataHolder.isClosed();
        return !bl2;
    }

    public Uri parseUri(String string2) {
        DataHolder dataHolder = this.mDataHolder;
        int n3 = this.mDataRow;
        int n4 = this.zaa;
        if ((string2 = dataHolder.getString(string2, n3, n4)) == null) {
            return null;
        }
        return Uri.parse((String)string2);
    }

    public final void zaa(int n3) {
        DataHolder dataHolder;
        int n4;
        boolean bl2 = false;
        if (n3 >= 0 && n3 < (n4 = (dataHolder = this.mDataHolder).getCount())) {
            bl2 = true;
        }
        Preconditions.checkState(bl2);
        this.mDataRow = n3;
        this.zaa = n3 = this.mDataHolder.getWindowIndex(n3);
    }
}

