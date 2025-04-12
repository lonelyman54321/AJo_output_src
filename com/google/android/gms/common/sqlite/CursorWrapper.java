/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.AbstractWindowedCursor
 *  android.database.CrossProcessCursor
 *  android.database.Cursor
 *  android.database.CursorWindow
 *  android.database.CursorWrapper
 */
package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

public class CursorWrapper
extends android.database.CursorWrapper
implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    public CursorWrapper(Cursor object) {
        super(object);
        int n3;
        int n4;
        IllegalArgumentException illegalArgumentException = null;
        for (n4 = 0; n4 < (n3 = 10) && (n3 = object instanceof android.database.CursorWrapper) != 0; ++n4) {
            object = ((android.database.CursorWrapper)object).getWrappedCursor();
        }
        n4 = object instanceof AbstractWindowedCursor;
        if (n4 != 0) {
            object = (AbstractWindowedCursor)object;
            this.zza = object;
            return;
        }
        object = object.getClass().getName();
        object = "Unknown type: ".concat((String)object);
        illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public void fillWindow(int n3, CursorWindow cursorWindow) {
        this.zza.fillWindow(n3, cursorWindow);
    }

    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    public final boolean onMove(int n3, int n4) {
        return this.zza.onMove(n3, n4);
    }

    public void setWindow(CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}

