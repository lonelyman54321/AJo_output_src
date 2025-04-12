/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class EntityBuffer
extends AbstractDataBuffer {
    private boolean zaa = false;
    private ArrayList zab;

    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zab() {
        synchronized (this) {
            block5: {
                boolean bl2;
                block6: {
                    Object object;
                    int n3;
                    Object object2;
                    Object object3;
                    Object object4;
                    int n4;
                    try {
                        n4 = this.zaa;
                        if (n4 != 0) break block5;
                        object4 = this.mDataHolder;
                        object4 = Preconditions.checkNotNull(object4);
                        object4 = (DataHolder)object4;
                        n4 = ((DataHolder)object4).getCount();
                        object3 = new ArrayList();
                        this.zab = object3;
                        bl2 = true;
                        if (n4 <= 0) break block6;
                        object2 = null;
                        Object object5 = 0;
                        ((ArrayList)object3).add(object5);
                        object3 = this.getPrimaryDataMarkerColumn();
                        object5 = this.mDataHolder;
                        n3 = ((DataHolder)object5).getWindowIndex(0);
                        object = this.mDataHolder;
                        object2 = ((DataHolder)object).getString((String)object3, 0, n3);
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                    for (n3 = 1; n3 < n4; ++n3) {
                        object = this.mDataHolder;
                        int n7 = ((DataHolder)object).getWindowIndex(n3);
                        Object object6 = this.mDataHolder;
                        if ((object6 = ((DataHolder)object6).getString((String)object3, n3, n7)) == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            object2 = "Missing value for markerColumn: ";
                            stringBuilder.append((String)object2);
                            stringBuilder.append((String)object3);
                            object3 = ", at row: ";
                            stringBuilder.append((String)object3);
                            stringBuilder.append(n3);
                            object3 = ", for window: ";
                            stringBuilder.append((String)object3);
                            stringBuilder.append(n7);
                            object3 = stringBuilder.toString();
                            object4 = new NullPointerException((String)object3);
                            throw object4;
                        }
                        n7 = (int)(((String)object6).equals(object2) ? 1 : 0);
                        if (n7 != 0) continue;
                        object2 = this.zab;
                        object = n3;
                        ((ArrayList)object2).add(object);
                        object2 = object6;
                    }
                }
                this.zaa = bl2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object get(int n3) {
        DataHolder dataHolder;
        String string2;
        int n4;
        this.zab();
        int n7 = this.zaa(n3);
        int n8 = 0;
        if (n3 < 0) return this.getEntry(n7, n8);
        Object object = this.zab;
        int n10 = ((ArrayList)object).size();
        if (n3 == n10) {
            return this.getEntry(n7, n8);
        }
        object = this.zab;
        n10 = ((ArrayList)object).size() + -1;
        if (n3 == n10) {
            object = (DataHolder)Preconditions.checkNotNull(this.mDataHolder);
            n10 = ((DataHolder)object).getCount();
            Integer n14 = (Integer)this.zab.get(n3);
            n4 = n14;
        } else {
            object = this.zab;
            n4 = n3 + 1;
            object = (Integer)((ArrayList)object).get(n4);
            n10 = (Integer)object;
            Integer n15 = (Integer)this.zab.get(n3);
            n4 = n15;
        }
        n10 -= n4;
        n4 = 1;
        if (n10 != n4) {
            n8 = n10;
            return this.getEntry(n7, n8);
        }
        n3 = this.zaa(n3);
        object = (DataHolder)Preconditions.checkNotNull(this.mDataHolder);
        n10 = ((DataHolder)object).getWindowIndex(n3);
        String string3 = this.getChildDataMarkerColumn();
        if (string3 != null && (string2 = (dataHolder = this.mDataHolder).getString(string3, n3, n10)) == null) {
            return this.getEntry(n7, n8);
        }
        n8 = 1;
        return this.getEntry(n7, n8);
    }

    public String getChildDataMarkerColumn() {
        return null;
    }

    public int getCount() {
        this.zab();
        return this.zab.size();
    }

    public abstract Object getEntry(int var1, int var2);

    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int n3) {
        Serializable serializable;
        int n4;
        if (n3 >= 0 && n3 < (n4 = ((ArrayList)(serializable = this.zab)).size())) {
            return (Integer)this.zab.get(n3);
        }
        String string2 = Gj0.b(n3, "Position ", " is out of bounds for this buffer");
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }
}

