/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.CharArrayBuffer
 *  android.database.Cursor
 *  android.database.CursorIndexOutOfBoundsException
 *  android.database.CursorWindow
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder$Builder;
import com.google.android.gms.common.data.zab;
import com.google.android.gms.common.data.zae;
import com.google.android.gms.common.data.zaf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;

public final class DataHolder
extends AbstractSafeParcelable
implements Closeable {
    public static final Parcelable.Creator CREATOR;
    private static final DataHolder$Builder zaf;
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final String[] zag;
    private final CursorWindow[] zah;
    private final int zai;
    private final Bundle zaj;
    private boolean zak;

    static {
        Object object = new zaf();
        CREATOR = object;
        String[] stringArray = new String[]{};
        zaf = object = new zab(stringArray, null);
    }

    public DataHolder(int n3, String[] stringArray, CursorWindow[] cursorWindowArray, int n4, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = n3;
        this.zag = stringArray;
        this.zah = cursorWindowArray;
        this.zai = n4;
        this.zaj = bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DataHolder(Cursor stringArray, int n3, Bundle bundle) {
        Throwable throwable2;
        CursorWindow[] cursorWindowArray;
        block7: {
            int n4;
            int n7;
            int n8;
            ArrayList<CursorWindow> arrayList;
            block6: {
                CursorWindow cursorWindow;
                block5: {
                    cursorWindowArray = new CursorWrapper((Cursor)stringArray);
                    stringArray = cursorWindowArray.getColumnNames();
                    arrayList = new ArrayList<CursorWindow>();
                    try {
                        n8 = cursorWindowArray.getCount();
                        cursorWindow = cursorWindowArray.getWindow();
                        if (cursorWindow == null || (n7 = cursorWindow.getStartPosition()) != 0) break block5;
                        cursorWindow.acquireReference();
                        cursorWindowArray.setWindow(null);
                        arrayList.add(cursorWindow);
                        n4 = cursorWindow.getNumRows();
                        break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                n4 = 0;
                cursorWindow = null;
            }
            while (n4 < n8 && (n7 = (int)(cursorWindowArray.moveToPosition(n4) ? 1 : 0)) != 0) {
                CursorWindow cursorWindow = cursorWindowArray.getWindow();
                if (cursorWindow != null) {
                    cursorWindow.acquireReference();
                    cursorWindowArray.setWindow(null);
                } else {
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(n4);
                    cursorWindowArray.fillWindow(n4, cursorWindow);
                }
                n4 = cursorWindow.getNumRows();
                if (n4 == 0) break;
                arrayList.add(cursorWindow);
                n4 = cursorWindow.getStartPosition();
                n7 = cursorWindow.getNumRows();
                n4 += n7;
            }
            cursorWindowArray.close();
            cursorWindowArray = new CursorWindow[arrayList.size()];
            cursorWindowArray = arrayList.toArray(cursorWindowArray);
            this(stringArray, cursorWindowArray, n3, bundle);
            return;
        }
        cursorWindowArray.close();
        throw throwable2;
    }

    private DataHolder(DataHolder$Builder cursorWindowArray, int n3, Bundle stringArray) {
        stringArray = DataHolder$Builder.zac((DataHolder$Builder)cursorWindowArray);
        cursorWindowArray = DataHolder.zaf((DataHolder$Builder)cursorWindowArray, -1);
        this(stringArray, cursorWindowArray, n3, null);
    }

    public /* synthetic */ DataHolder(DataHolder$Builder cursorWindowArray, int n3, Bundle bundle, int n4, zae zae2) {
        String[] stringArray = DataHolder$Builder.zac((DataHolder$Builder)cursorWindowArray);
        cursorWindowArray = DataHolder.zaf((DataHolder$Builder)cursorWindowArray, -1);
        this(stringArray, cursorWindowArray, n3, bundle);
    }

    public /* synthetic */ DataHolder(DataHolder$Builder dataHolder$Builder, int n3, Bundle bundle, zae zae2) {
        this(dataHolder$Builder, n3, null);
    }

    public DataHolder(String[] stringArray, CursorWindow[] cursorWindowArray, int n3, Bundle bundle) {
        boolean bl2;
        this.zae = false;
        this.zak = bl2 = true;
        this.zaa = (int)(bl2 ? 1 : 0);
        stringArray = (String[])Preconditions.checkNotNull(stringArray);
        this.zag = stringArray;
        stringArray = (CursorWindow[])Preconditions.checkNotNull(cursorWindowArray);
        this.zah = stringArray;
        this.zai = n3;
        this.zaj = bundle;
        this.zad();
    }

    public static DataHolder$Builder builder(String[] stringArray) {
        DataHolder$Builder dataHolder$Builder = new DataHolder$Builder(stringArray, null, null);
        return dataHolder$Builder;
    }

    public static DataHolder empty(int n3) {
        DataHolder$Builder dataHolder$Builder = zaf;
        DataHolder dataHolder = new DataHolder(dataHolder$Builder, n3, null);
        return dataHolder;
    }

    private final void zae(String object, int n3) {
        int n4;
        Bundle bundle = this.zab;
        if (bundle != null && (n4 = bundle.containsKey((String)object)) != 0) {
            int n7 = this.isClosed();
            if (n7 == 0) {
                if (n3 >= 0 && n3 < (n7 = this.zad)) {
                    return;
                }
                n4 = this.zad;
                object = new CursorIndexOutOfBoundsException(n3, n4);
                throw object;
            }
            object = new IllegalArgumentException("Buffer is closed.");
            throw object;
        }
        object = String.valueOf(object);
        object = "No such column: ".concat((String)object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    /*
     * Exception decompiling
     */
    private static CursorWindow[] zaf(DataHolder$Builder var0, int var1_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [14 : 199->206)] java.lang.RuntimeException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        CursorWindow cursorWindow;
                        int n3;
                        int n4 = this.zae;
                        if (n4 != 0) break block4;
                        this.zae = n4 = 1;
                        Object var2_2 = null;
                        for (n4 = 0; n4 < (n3 = ((CursorWindow[])(cursorWindow = this.zah)).length); ++n4) {
                            cursorWindow = cursorWindow[n4];
                            cursorWindow.close();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void finalize() {
        Throwable throwable2;
        block7: {
            block6: {
                int n3;
                try {
                    n3 = this.zak;
                    if (n3 == 0) break block6;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                CursorWindow[] cursorWindowArray = this.zah;
                n3 = cursorWindowArray.length;
                if (n3 <= 0) break block6;
                n3 = (int)(this.isClosed() ? 1 : 0);
                if (n3 != 0) break block6;
                this.close();
            }
            super.finalize();
            return;
        }
        super.finalize();
        throw throwable2;
    }

    public boolean getBoolean(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        Bundle bundle = this.zab;
        int n7 = bundle.getInt(string2);
        long l2 = cursorWindow.getLong(n3, n7);
        long l3 = 1L;
        n4 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
        return n4 == 0;
    }

    public byte[] getByteArray(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getBlob(n3, n7);
    }

    public int getCount() {
        return this.zad;
    }

    public int getInteger(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getInt(n3, n7);
    }

    public long getLong(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getLong(n3, n7);
    }

    public Bundle getMetadata() {
        return this.zaj;
    }

    public int getStatusCode() {
        return this.zai;
    }

    public String getString(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getString(n3, n7);
    }

    public int getWindowIndex(int n3) {
        int n4;
        int[] nArray;
        int n7;
        int n8 = 0;
        if (n3 >= 0 && n3 < (n7 = this.zad)) {
            n7 = 1;
        } else {
            n7 = 0;
            nArray = null;
        }
        Preconditions.checkState(n7 != 0);
        while (n8 < (n4 = (nArray = this.zac).length)) {
            n7 = nArray[n8];
            if (n3 < n7) {
                n8 += -1;
                break;
            }
            ++n8;
        }
        if (n8 == n4) {
            n8 += -1;
        }
        return n8;
    }

    public boolean hasColumn(String string2) {
        return this.zab.containsKey(string2);
    }

    public boolean hasNull(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.isNull(n3, n7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isClosed() {
        synchronized (this) {
            return this.zae;
        }
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String[] stringArray = this.zag;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        int n7 = 1;
        SafeParcelWriter.writeStringArray(parcel, n7, stringArray, false);
        Bundle bundle = this.zah;
        SafeParcelWriter.writeTypedArray(parcel, 2, (Parcelable[])bundle, n3, false);
        int n8 = this.getStatusCode();
        SafeParcelWriter.writeInt(parcel, 3, n8);
        bundle = this.getMetadata();
        SafeParcelWriter.writeBundle(parcel, 4, bundle, false);
        int n10 = 1000;
        int n14 = this.zaa;
        SafeParcelWriter.writeInt(parcel, n10, n14);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
        int n15 = n3 & 1;
        if (n15 != 0) {
            this.close();
        }
    }

    public final double zaa(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getDouble(n3, n7);
    }

    public final float zab(String string2, int n3, int n4) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        return cursorWindow.getFloat(n3, n7);
    }

    public final void zac(String string2, int n3, int n4, CharArrayBuffer charArrayBuffer) {
        this.zae(string2, n3);
        CursorWindow cursorWindow = this.zah[n4];
        int n7 = this.zab.getInt(string2);
        cursorWindow.copyStringToBuffer(n3, n7, charArrayBuffer);
    }

    public final void zad() {
        Bundle bundle;
        Object object;
        int n3;
        int n4;
        Bundle bundle2;
        this.zab = bundle2 = new Bundle();
        int n7 = 0;
        bundle2 = null;
        int[] nArray = null;
        for (n4 = 0; n4 < (n3 = ((String[])(object = this.zag)).length); ++n4) {
            bundle = this.zab;
            object = object[n4];
            bundle.putInt((String)object, n4);
        }
        nArray = new int[this.zah.length];
        this.zac = nArray;
        n4 = 0;
        nArray = null;
        while (n7 < (n3 = ((String[])(object = this.zah)).length)) {
            this.zac[n7] = n4;
            object = object[n7];
            int n8 = object.getStartPosition();
            n8 = n4 - n8;
            bundle = this.zah[n7];
            n3 = bundle.getNumRows() - n8;
            n4 += n3;
            ++n7;
        }
        this.zad = n4;
    }
}

