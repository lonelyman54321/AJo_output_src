/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.zaa;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    ParcelFileDescriptor zab;
    final int zac;
    private Bitmap zad;
    private boolean zae;
    private File zaf;

    static {
        zaa zaa2 = new zaa();
        CREATOR = zaa2;
    }

    public BitmapTeleporter(int n3, ParcelFileDescriptor parcelFileDescriptor, int n4) {
        this.zaa = n3;
        this.zab = parcelFileDescriptor;
        this.zac = n4;
        this.zad = null;
        this.zae = false;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        int n3;
        this.zaa = n3 = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final void zaa(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bitmap get() {
        Throwable throwable2222222;
        Object object;
        block4: {
            boolean bl2 = this.zae;
            if (bl2) return this.zad;
            Object object2 = (ParcelFileDescriptor)Preconditions.checkNotNull(this.zab);
            Object object3 = new ParcelFileDescriptor.AutoCloseInputStream(object2);
            object = new DataInputStream((InputStream)object3);
            int n3 = ((DataInputStream)object).readInt();
            object3 = new byte[n3];
            int n4 = ((DataInputStream)object).readInt();
            int n7 = ((DataInputStream)object).readInt();
            String string2 = ((DataInputStream)object).readUTF();
            string2 = Bitmap.Config.valueOf((String)string2);
            ((DataInputStream)object).read((byte[])object3);
            {
                catch (Throwable throwable2222222) {
                    break block4;
                }
                catch (IOException iOException) {}
                {
                    String string3 = "Could not read from parcel file descriptor";
                    object2 = new IllegalStateException(string3, iOException);
                    throw object2;
                }
            }
            BitmapTeleporter.zaa((Closeable)object);
            object = ByteBuffer.wrap((byte[])object3);
            object3 = Bitmap.createBitmap((int)n4, (int)n7, (Bitmap.Config)string2);
            object3.copyPixelsFromBuffer((Buffer)object);
            this.zad = object3;
            this.zae = bl2 = true;
            return this.zad;
        }
        BitmapTeleporter.zaa((Closeable)object);
        throw throwable2222222;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void release() {
        boolean bl2 = this.zae;
        if (bl2) return;
        try {
            ParcelFileDescriptor parcelFileDescriptor = this.zab;
            Object object = Preconditions.checkNotNull(parcelFileDescriptor);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor)object;
            parcelFileDescriptor2.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public void setTempDir(File serializable) {
        if (serializable != null) {
            this.zaf = serializable;
            return;
        }
        serializable = new NullPointerException("Cannot set null temp directory");
        throw serializable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeToParcel(Parcel object, int n3) {
        Throwable throwable222222;
        Object object2;
        int n4;
        int n7;
        Object object3 = this.zab;
        if (object3 == null) {
            object3 = (Bitmap)Preconditions.checkNotNull(this.zad);
            n7 = object3.getRowBytes();
            n4 = object3.getHeight() * n7;
            Object object4 = ByteBuffer.allocate(n4);
            object3.copyPixelsToBuffer((Buffer)object4);
            object4 = ((ByteBuffer)object4).array();
            object2 = this.zaf;
            if (object2 == null) {
                object = new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
                throw object;
            }
            Object object5 = "teleporter";
            String string2 = ".tmp";
            try {
                object2 = File.createTempFile((String)object5, string2, (File)object2);
            }
            catch (IOException iOException) {
                IllegalStateException illegalStateException = new IllegalStateException("Could not create temporary file", iOException);
                throw illegalStateException;
            }
            try {
                object5 = new FileOutputStream((File)object2);
                int n8 = 0x10000000;
                string2 = ParcelFileDescriptor.open((File)object2, (int)n8);
                this.zab = string2;
                ((File)object2).delete();
            }
            catch (FileNotFoundException fileNotFoundException) {
                object = new IllegalStateException("Temporary file is somehow already deleted");
                throw object;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)object5);
            object2 = new DataOutputStream(bufferedOutputStream);
            n4 = ((Object)object4).length;
            ((DataOutputStream)object2).writeInt(n4);
            n4 = object3.getWidth();
            ((DataOutputStream)object2).writeInt(n4);
            n4 = object3.getHeight();
            ((DataOutputStream)object2).writeInt(n4);
            object3 = object3.getConfig();
            object3 = object3.toString();
            ((DataOutputStream)object2).writeUTF((String)object3);
            ((OutputStream)object2).write((byte[])object4);
            BitmapTeleporter.zaa((Closeable)object2);
        }
        int n10 = 1;
        n7 = SafeParcelWriter.beginObjectHeader(object);
        n4 = this.zaa;
        SafeParcelWriter.writeInt(object, n10, n4);
        object3 = this.zab;
        SafeParcelWriter.writeParcelable(object, 2, (Parcelable)object3, n3 |= n10, false);
        n10 = this.zac;
        SafeParcelWriter.writeInt(object, 3, n10);
        SafeParcelWriter.finishObjectHeader(object, n7);
        this.zab = null;
        return;
        {
            catch (Throwable throwable222222) {
            }
            catch (IOException iOException) {}
            {
                object3 = "Could not write into unlinked file";
                IllegalStateException illegalStateException = new IllegalStateException((String)object3, iOException);
                throw illegalStateException;
            }
        }
        BitmapTeleporter.zaa((Closeable)object2);
        throw throwable222222;
    }
}

