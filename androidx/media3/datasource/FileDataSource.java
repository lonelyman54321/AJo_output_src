/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.text.TextUtils
 */
package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource
extends Yv {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 object) {
        Object object2;
        FileNotFoundException fileNotFoundException2;
        Object object3;
        block18: {
            int n3;
            block20: {
                block19: {
                    block16: {
                        SecurityException securityException2;
                        block15: {
                            RuntimeException runtimeException2;
                            int n4;
                            block14: {
                                IOException iOException2;
                                block17: {
                                    long l2;
                                    RandomAccessFile randomAccessFile;
                                    object3 = ((ti0_1)object).a;
                                    long l3 = ((ti0_1)object).f;
                                    this.f = object3;
                                    this.n((ti0_1)object);
                                    n4 = 2000;
                                    n3 = 2006;
                                    try {
                                        String string2 = object3.getPath();
                                        string2.getClass();
                                        String string3 = "r";
                                        this.e = randomAccessFile = new RandomAccessFile(string2, string3);
                                    }
                                    catch (RuntimeException runtimeException2) {
                                        break block14;
                                    }
                                    catch (SecurityException securityException2) {
                                        break block15;
                                    }
                                    catch (FileNotFoundException fileNotFoundException2) {
                                        break block16;
                                    }
                                    try {
                                        randomAccessFile.seek(l3);
                                        l2 = ((ti0_1)object).g;
                                        long l4 = -1;
                                        long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                                        if (l7 == false) {
                                            object3 = this.e;
                                            l2 = ((RandomAccessFile)object3).length() - l3;
                                        }
                                    }
                                    catch (IOException iOException2) {
                                        break block17;
                                    }
                                    {
                                        this.g = l2;
                                        long l8 = 0L;
                                        long l12 = l2 - l8;
                                        Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                                        if (object4 >= 0) {
                                            this.h = true;
                                            this.o((ti0_1)object);
                                            return this.g;
                                        }
                                        object = new DataSourceException(null, null, 2008);
                                    }
                                    throw object;
                                }
                                object3 = new DataSourceException(iOException2, n4);
                                throw object3;
                            }
                            object3 = new DataSourceException(runtimeException2, n4);
                            throw object3;
                        }
                        object3 = new DataSourceException(securityException2, n3);
                        throw object3;
                    }
                    object2 = object3.getQuery();
                    int n7 = TextUtils.isEmpty((CharSequence)object2);
                    if (n7 == 0 || (n7 = TextUtils.isEmpty((CharSequence)(object2 = object3.getFragment()))) == 0) break block18;
                    object2 = fileNotFoundException2.getCause();
                    n7 = object2 instanceof ErrnoException;
                    if (n7 == 0) break block19;
                    object2 = (ErrnoException)fileNotFoundException2.getCause();
                    n7 = ((ErrnoException)((Object)object2)).errno;
                    int n8 = OsConstants.EACCES;
                    if (n7 == n8) break block20;
                }
                n3 = 2005;
            }
            object3 = new DataSourceException(fileNotFoundException2, n3);
            throw object3;
        }
        CharSequence charSequence = object3.getPath();
        String string4 = object3.getQuery();
        object3 = object3.getFragment();
        charSequence = og_1.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", (String)charSequence, ",query=", string4, ",fragment=");
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((StringBuilder)charSequence).toString();
        object2 = new DataSourceException((String)object3, fileNotFoundException2, 1004);
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable2;
        boolean bl2;
        block7: {
            bl2 = false;
            this.f = null;
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            bl2 = this.h;
            if (bl2) {
                this.h = false;
                this.m();
            }
            return;
            {
                int n3 = 2000;
                FileDataSource$FileDataSourceException fileDataSource$FileDataSourceException = new DataSourceException(iOException, n3);
                throw fileDataSource$FileDataSourceException;
            }
        }
        this.e = null;
        bl2 = this.h;
        if (bl2) {
            this.h = false;
            this.m();
        }
        throw throwable2;
    }

    public final Uri k() {
        return this.f;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        block5: {
            RandomAccessFile randomAccessFile;
            if (n4 == 0) {
                return 0;
            }
            long l2 = this.g;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                return -1;
            }
            try {
                randomAccessFile = this.e;
            }
            catch (IOException iOException) {
                FileDataSource$FileDataSourceException fileDataSource$FileDataSourceException = new DataSourceException(iOException, 2000);
                throw fileDataSource$FileDataSourceException;
            }
            long l7 = n4;
            {
                l2 = Math.min(l2, l7);
                n4 = (int)l2;
                n7 = randomAccessFile.read(byArray, n3, n4);
                if (n7 <= 0) break block5;
                long l8 = this.g;
            }
            l2 = n7;
            this.g = l8 -= l2;
            this.l(n7);
        }
        return n7;
    }
}

