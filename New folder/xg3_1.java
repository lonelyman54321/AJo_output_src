/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.os.CancellationSignal
 */
import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/*
 * Renamed from xg3
 */
public interface xg3_1
extends Closeable {
    public void B();

    public boolean B0();

    public int E0(ContentValues var1, Object[] var2);

    public void F();

    public bg3_0 e0(String var1);

    public void i();

    public boolean isOpen();

    public Cursor j(ag3_0 var1);

    public void n0(Object[] var1);

    public void o(String var1);

    public Cursor o0(ag3_0 var1, CancellationSignal var2);

    public Cursor r0(String var1);

    public void y();

    public boolean z0();
}

