/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 */
package com.facebook;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.GraphRequest$c;
import com.facebook.GraphRequest$e;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;

public final class GraphRequest$g
implements GraphRequest$e {
    public final OutputStream a;
    public final sx1 b;
    public boolean c;
    public final boolean d;

    public GraphRequest$g(OutputStream outputStream, sx1 sx12, boolean bl2) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        this.a = outputStream;
        this.b = sx12;
        this.c = true;
        this.d = bl2;
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.c(string2, null, null);
        int n3 = 1;
        Object object = new Object[n3];
        String string4 = null;
        object[0] = string3;
        this.f("%s", (Object[])object);
        this.h();
        sx1 sx12 = this.b;
        if (sx12 != null) {
            string4 = "    ";
            object = new StringBuilder(string4);
            ((StringBuilder)object).append(string2);
            string2 = ((StringBuilder)object).toString();
            sx12.a(string3, string2);
        }
    }

    public final void b(String object, Object ... object2) {
        Intrinsics.checkNotNullParameter(object, "format");
        Object object3 = "args";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        int n3 = this.d;
        String string2 = "this as java.lang.String).getBytes(charset)";
        OutputStream outputStream = this.a;
        if (n3 == 0) {
            Object object4;
            n3 = this.c;
            if (n3 != 0) {
                object3 = Charsets.UTF_8;
                object4 = "--".getBytes((Charset)object3);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                outputStream.write((byte[])object4);
                object4 = GraphRequest.j.getBytes((Charset)object3);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                outputStream.write((byte[])object4);
                object4 = "\r\n";
                object3 = ((String)object4).getBytes((Charset)object3);
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                outputStream.write((byte[])object3);
                n3 = 0;
                object3 = null;
                this.c = false;
            }
            object3 = StringCompanionObject.INSTANCE;
            n3 = ((Object[])object2).length;
            object2 = Arrays.copyOf(object2, n3);
            n3 = ((Object[])object2).length;
            object4 = "format(format, *args)";
            object = xh2_0.a(object2, n3, (String)object, (String)object4);
            object2 = Charsets.UTF_8;
            object = ((String)object).getBytes((Charset)object2);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            outputStream.write((byte[])object);
        } else {
            object3 = StringCompanionObject.INSTANCE;
            object3 = Locale.US;
            int n4 = ((Object[])object2).length;
            object2 = Arrays.copyOf(object2, n4);
            n4 = ((Object[])object2).length;
            String string3 = "format(locale, format, *args)";
            object = URLEncoder.encode(IV0.a(object2, n4, (Locale)object3, (String)object, string3), "UTF-8");
            Intrinsics.checkNotNullExpressionValue(object, "encode(String.format(Loc\u2026 format, *args), \"UTF-8\")");
            object2 = Charsets.UTF_8;
            object = ((String)object).getBytes((Charset)object2);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            outputStream.write((byte[])object);
        }
    }

    public final void c(String objectArray, String object, String string2) {
        int n3 = 1;
        boolean bl2 = this.d;
        if (!bl2) {
            Object object2 = "Content-Disposition: form-data; name=\"%s\"";
            Object[] objectArray2 = new Object[n3];
            objectArray2[0] = objectArray;
            this.b((String)object2, objectArray2);
            if (object != null) {
                objectArray = "; filename=\"%s\"";
                object2 = new Object[n3];
                object2[0] = object;
                this.b((String)objectArray, object2);
            }
            objectArray = new Object[]{};
            object = "";
            this.f((String)object, objectArray);
            if (string2 != null) {
                int n4 = 2;
                objectArray = new Object[n4];
                objectArray[0] = object2 = "Content-Type";
                objectArray[n3] = string2;
                string2 = "%s: %s";
                this.f(string2, objectArray);
            }
            objectArray = new Object[]{};
            this.f((String)object, objectArray);
        } else {
            object = StringCompanionObject.INSTANCE;
            object = new Object[n3];
            object[0] = objectArray;
            string2 = "format(format, *args)";
            objectArray = xh2_0.a((Object[])object, n3, "%s=", string2);
            object = Charsets.UTF_8;
            objectArray = objectArray.getBytes((Charset)object);
            Intrinsics.checkNotNullExpressionValue(objectArray, "this as java.lang.String).getBytes(charset)");
            object = this.a;
            ((OutputStream)object).write((byte[])objectArray);
        }
    }

    public final void d(String string2, Uri object, String object2) {
        int n3;
        Object[] objectArray;
        Object object3;
        String string3;
        int n4;
        block13: {
            block12: {
                long l2;
                block11: {
                    n4 = 1;
                    string3 = null;
                    Intrinsics.checkNotNullParameter(string2, "key");
                    object3 = "contentUri";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    if (object2 == null) {
                        object2 = "content/unknown";
                    }
                    this.c(string2, string2, (String)object2);
                    object2 = this.a;
                    boolean bl2 = object2 instanceof rb2_0;
                    if (!bl2) break block12;
                    objectArray = lz3_0.a;
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = null;
                    try {
                        objectArray = FacebookSdk.a();
                    }
                    catch (Throwable throwable) {
                        if (object3 != null) {
                            object3.close();
                        }
                        throw throwable;
                    }
                    ContentResolver contentResolver = objectArray.getContentResolver();
                    object3 = contentResolver.query(object, null, null, null, null);
                    if (object3 == null) {
                        l2 = 0L;
                        break block11;
                    }
                    object = "_size";
                    n3 = object3.getColumnIndex((String)object);
                    object3.moveToFirst();
                    long l3 = object3.getLong(n3);
                    object3.close();
                    l2 = l3;
                }
                object2 = (rb2_0)object2;
                ((rb2_0)object2).b(l2);
                n3 = 0;
                object = null;
                break block13;
            }
            object3 = FacebookSdk.a().getContentResolver();
            object = object3.openInputStream(object);
            n3 = lz3_0.k((InputStream)object, (OutputStream)object2);
        }
        object3 = new Object[]{};
        this.f("", (Object[])object3);
        this.h();
        object2 = this.b;
        if (object2 != null) {
            string2 = kp1_0.c("    ", string2);
            object3 = StringCompanionObject.INSTANCE;
            object3 = Locale.ROOT;
            object = n3;
            objectArray = new Object[n4];
            objectArray[0] = object;
            string3 = "format(locale, format, *args)";
            object = IV0.a(objectArray, n4, (Locale)object3, "<Data: %d>", string3);
            ((sx1)object2).a(object, string2);
        }
    }

    public final void e(String string2, ParcelFileDescriptor object, String object2) {
        int n3;
        int n4 = 1;
        String string3 = null;
        Intrinsics.checkNotNullParameter(string2, "key");
        Object object3 = "descriptor";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        if (object2 == null) {
            object2 = "content/unknown";
        }
        this.c(string2, string2, (String)object2);
        object2 = this.a;
        boolean bl2 = object2 instanceof rb2_0;
        if (bl2) {
            object2 = (rb2_0)object2;
            long l2 = object.getStatSize();
            ((rb2_0)object2).b(l2);
            n3 = 0;
            object = null;
        } else {
            object3 = new ParcelFileDescriptor.AutoCloseInputStream(object);
            n3 = lz3_0.k((InputStream)object3, (OutputStream)object2);
        }
        object3 = new Object[]{};
        this.f("", object3);
        this.h();
        object2 = this.b;
        if (object2 != null) {
            string2 = kp1_0.c("    ", string2);
            object3 = StringCompanionObject.INSTANCE;
            object3 = Locale.ROOT;
            object = n3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = object;
            string3 = "format(locale, format, *args)";
            object = IV0.a(objectArray, n4, (Locale)object3, "<Data: %d>", string3);
            ((sx1)object2).a(object, string2);
        }
    }

    public final void f(String objectArray, Object ... object) {
        Intrinsics.checkNotNullParameter(objectArray, "format");
        String string2 = "args";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Object[])object).length;
        object = Arrays.copyOf(object, n3);
        this.b((String)objectArray, object);
        boolean bl2 = this.d;
        if (!bl2) {
            bl2 = false;
            objectArray = new Object[]{};
            object = "\r\n";
            this.b((String)object, objectArray);
        }
    }

    public final void g(String object, Object object2, GraphRequest object3) {
        String string2;
        block13: {
            block15: {
                block8: {
                    boolean bl2;
                    block14: {
                        boolean bl3;
                        block12: {
                            block11: {
                                int n3;
                                block10: {
                                    String string3;
                                    sx1 sx12;
                                    Object object4;
                                    OutputStream outputStream;
                                    Object[] objectArray;
                                    String string4;
                                    block9: {
                                        block7: {
                                            n3 = 1;
                                            bl2 = false;
                                            string4 = null;
                                            objectArray = "key";
                                            Intrinsics.checkNotNullParameter(object, (String)objectArray);
                                            outputStream = this.a;
                                            boolean bl4 = outputStream instanceof gk2_0;
                                            if (bl4) {
                                                Intrinsics.checkNotNull(outputStream, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                                                object4 = outputStream;
                                                object4 = (gk2_0)((Object)outputStream);
                                                object4.a((GraphRequest)object3);
                                            }
                                            object3 = GraphRequest.j;
                                            bl3 = GraphRequest$c.f(object2);
                                            if (!bl3) break block7;
                                            object2 = GraphRequest$c.a(object2);
                                            this.a((String)object, (String)object2);
                                            break block8;
                                        }
                                        bl3 = object2 instanceof Bitmap;
                                        object4 = "    ";
                                        sx12 = this.b;
                                        string3 = "";
                                        if (!bl3) break block9;
                                        object2 = (Bitmap)object2;
                                        Intrinsics.checkNotNullParameter(object, (String)objectArray);
                                        Intrinsics.checkNotNullParameter(object2, "bitmap");
                                        this.c((String)object, (String)object, "image/png");
                                        object3 = Bitmap.CompressFormat.PNG;
                                        n3 = 100;
                                        object2.compress((Bitmap.CompressFormat)object3, n3, outputStream);
                                        object2 = new Object[]{};
                                        this.f(string3, (Object[])object2);
                                        this.h();
                                        if (sx12 != null) {
                                            object2 = new StringBuilder((String)object4);
                                            ((StringBuilder)object2).append((String)object);
                                            object = ((StringBuilder)object2).toString();
                                            object2 = "<Image>";
                                            sx12.a(object2, (String)object);
                                        }
                                        break block8;
                                    }
                                    bl3 = object2 instanceof byte[];
                                    if (!bl3) break block10;
                                    object2 = (byte[])object2;
                                    Intrinsics.checkNotNullParameter(object, (String)objectArray);
                                    Intrinsics.checkNotNullParameter(object2, "bytes");
                                    this.c((String)object, (String)object, "content/unknown");
                                    outputStream.write((byte[])object2);
                                    object3 = new Object[]{};
                                    this.f(string3, (Object[])object3);
                                    this.h();
                                    if (sx12 != null) {
                                        object = kp1_0.c((String)object4, (String)object);
                                        object3 = StringCompanionObject.INSTANCE;
                                        object3 = Locale.ROOT;
                                        int n4 = ((Object)object2).length;
                                        object2 = n4;
                                        objectArray = new Object[n3];
                                        objectArray[0] = object2;
                                        string4 = "format(locale, format, *args)";
                                        object2 = IV0.a(objectArray, n3, (Locale)object3, "<Data: %d>", string4);
                                        sx12.a(object2, (String)object);
                                    }
                                    break block8;
                                }
                                bl3 = object2 instanceof Uri;
                                n3 = 0;
                                string2 = null;
                                if (!bl3) break block11;
                                object2 = (Uri)object2;
                                this.d((String)object, (Uri)object2, null);
                                break block8;
                            }
                            bl3 = object2 instanceof ParcelFileDescriptor;
                            if (!bl3) break block12;
                            object2 = (ParcelFileDescriptor)object2;
                            this.e((String)object, (ParcelFileDescriptor)object2, null);
                            break block8;
                        }
                        bl3 = object2 instanceof GraphRequest$ParcelableResourceWithMimeType;
                        string2 = "value is not a supported type.";
                        if (!bl3) break block13;
                        object2 = (GraphRequest$ParcelableResourceWithMimeType)object2;
                        object3 = ((GraphRequest$ParcelableResourceWithMimeType)object2).b;
                        bl2 = object3 instanceof ParcelFileDescriptor;
                        object2 = ((GraphRequest$ParcelableResourceWithMimeType)object2).a;
                        if (!bl2) break block14;
                        object3 = (ParcelFileDescriptor)object3;
                        this.e((String)object, (ParcelFileDescriptor)object3, (String)object2);
                        break block8;
                    }
                    bl2 = object3 instanceof Uri;
                    if (!bl2) break block15;
                    object3 = (Uri)object3;
                    this.d((String)object, (Uri)object3, (String)object2);
                }
                return;
            }
            object = new IllegalArgumentException(string2);
            throw object;
        }
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void h() {
        int n3 = (int)(this.d ? 1 : 0);
        if (n3 == 0) {
            n3 = 1;
            Object[] objectArray = new Object[n3];
            String string2 = GraphRequest.j;
            objectArray[0] = string2;
            string2 = "--%s";
            this.f(string2, objectArray);
        } else {
            Object object = Charsets.UTF_8;
            byte[] byArray = "&".getBytes((Charset)object);
            Intrinsics.checkNotNullExpressionValue(byArray, "this as java.lang.String).getBytes(charset)");
            object = this.a;
            ((OutputStream)object).write(byArray);
        }
    }
}

