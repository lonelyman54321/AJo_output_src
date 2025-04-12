/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.ContentDataSource;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.UdpDataSource;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class a
implements DataSource {
    public final Context a;
    public final ArrayList b;
    public final DataSource c;
    public FileDataSource d;
    public AssetDataSource e;
    public ContentDataSource f;
    public DataSource g;
    public UdpDataSource h;
    public ni0_2 i;
    public RawResourceDataSource j;
    public DataSource k;

    public a(Context object, DataSource dataSource) {
        this.a = object = object.getApplicationContext();
        dataSource.getClass();
        this.c = dataSource;
        this.b = object;
    }

    public static void m(DataSource dataSource, Kq3 kq3) {
        if (dataSource != null) {
            dataSource.g(kq3);
        }
    }

    public final long a(ti0_1 ti0_12) {
        String string2;
        boolean bl2;
        boolean bl3;
        Object object = this.k;
        boolean bl4 = false;
        String string3 = null;
        if (object == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        ct3.f(bl3);
        object = ti0_12.a.getScheme();
        int n3 = gz3.a;
        Object object2 = ti0_12.a;
        Object object3 = object2.getScheme();
        boolean bl5 = TextUtils.isEmpty((CharSequence)object3);
        Context context = this.a;
        if (!bl5 && !(bl2 = (string2 = "file").equals(object3))) {
            object2 = "asset";
            n3 = (int)(((String)object2).equals(object) ? 1 : 0);
            if (n3 != 0) {
                object = this.e;
                if (object == null) {
                    this.e = object = new AssetDataSource(context);
                    this.l((DataSource)object);
                }
                this.k = object = this.e;
            } else {
                object2 = "content";
                n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                if (n3 != 0) {
                    object = this.f;
                    if (object == null) {
                        this.f = object = new ContentDataSource(context);
                        this.l((DataSource)object);
                    }
                    this.k = object = this.f;
                } else {
                    object2 = "rtmp";
                    n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                    object3 = this.c;
                    if (n3 != 0) {
                        object = this.g;
                        if (object == null) {
                            object = "androidx.media3.datasource.rtmp.RtmpDataSource";
                            object = Class.forName((String)object);
                            bl4 = false;
                            string3 = null;
                            object = ((Class)object).getConstructor(null);
                            object = ((Constructor)object).newInstance(null);
                            object = (DataSource)object;
                            this.g = object;
                            try {
                                this.l((DataSource)object);
                            }
                            catch (Exception exception) {
                                object = new RuntimeException("Error instantiating RTMP extension", exception);
                                throw object;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                object = "Attempting to play RTMP stream without depending on the RTMP extension";
                                Cx.f((String)object);
                            }
                            object = this.g;
                            if (object == null) {
                                this.g = object3;
                            }
                        }
                        this.k = object = this.g;
                    } else {
                        object2 = "udp";
                        n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                        if (n3 != 0) {
                            object = this.h;
                            if (object == null) {
                                this.h = object = new UdpDataSource();
                                this.l((DataSource)object);
                            }
                            this.k = object = this.h;
                        } else {
                            object2 = "data";
                            n3 = (int)(((String)object2).equals(object) ? 1 : 0);
                            if (n3 != 0) {
                                object = this.i;
                                if (object == null) {
                                    this.i = object = new Yv(false);
                                    this.l((DataSource)object);
                                }
                                this.k = object = this.i;
                            } else {
                                string3 = "rawresource";
                                bl4 = string3.equals(object);
                                if (!bl4 && !(bl3 = (string3 = "android.resource").equals(object))) {
                                    this.k = object3;
                                } else {
                                    object = this.j;
                                    if (object == null) {
                                        this.j = object = new RawResourceDataSource(context);
                                        this.l((DataSource)object);
                                    }
                                    this.k = object = this.j;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            object = object2.getPath();
            if (object != null && (bl3 = ((String)object).startsWith((String)(object2 = "/android_asset/")))) {
                object = this.e;
                if (object == null) {
                    this.e = object = new AssetDataSource(context);
                    this.l((DataSource)object);
                }
                this.k = object = this.e;
            } else {
                object = this.d;
                if (object == null) {
                    this.d = object = new Yv(false);
                    this.l((DataSource)object);
                }
                this.k = object = this.d;
            }
        }
        return this.k.a(ti0_12);
    }

    public final Map c() {
        Object object = this.k;
        object = object == null ? Collections.emptyMap() : object.c();
        return object;
    }

    public final void close() {
        DataSource dataSource = this.k;
        if (dataSource != null) {
            try {
                dataSource.close();
            }
            finally {
                this.k = null;
            }
        }
    }

    public final void g(Kq3 kq3) {
        kq3.getClass();
        this.c.g(kq3);
        this.b.add(kq3);
        androidx.media3.datasource.a.m(this.d, kq3);
        androidx.media3.datasource.a.m(this.e, kq3);
        androidx.media3.datasource.a.m(this.f, kq3);
        androidx.media3.datasource.a.m(this.g, kq3);
        androidx.media3.datasource.a.m(this.h, kq3);
        androidx.media3.datasource.a.m(this.i, kq3);
        androidx.media3.datasource.a.m(this.j, kq3);
    }

    public final Uri k() {
        DataSource dataSource = this.k;
        dataSource = dataSource == null ? null : dataSource.k();
        return dataSource;
    }

    public final void l(DataSource dataSource) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.b)).size()); ++i3) {
            object = (Kq3)((ArrayList)object).get(i3);
            dataSource.g((Kq3)object);
        }
    }

    public final int read(byte[] byArray, int n3, int n4) {
        DataSource dataSource = this.k;
        dataSource.getClass();
        return dataSource.read(byArray, n3, n4);
    }
}

