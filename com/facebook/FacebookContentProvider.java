/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  android.util.Pair
 */
package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class FacebookContentProvider
extends ContentProvider {
    public static final /* synthetic */ int a;

    public final int delete(Uri uri, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ParcelFileDescriptor openFile(Uri object, String object2) {
        FileNotFoundException fileNotFoundException2;
        block13: {
            block11: {
                block12: {
                    int n3;
                    int n4;
                    Object object3;
                    block10: {
                        Intrinsics.checkNotNullParameter(object, "uri");
                        Intrinsics.checkNotNullParameter(object2, "mode");
                        object2 = "..";
                        try {
                            object = object.getPath();
                            if (object == null) {
                                object = "Required value was null.";
                                object = object.toString();
                                object2 = new IllegalStateException((String)object);
                                throw object2;
                            }
                            object3 = "checkNotNull(uri.path)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            n4 = 1;
                            object = ((String)object).substring(n4);
                            Object object4 = "this as java.lang.String).substring(startIndex)";
                            Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                            object4 = "/";
                            object4 = new String[]{object4};
                            int n7 = 6;
                            object = StringsKt.a0((CharSequence)object, object4, false, 0, n7);
                            object = (Collection)object;
                            object4 = new String[]{};
                            object = object.toArray((T[])object4);
                            object = (String[])object;
                            object4 = object[0];
                            object = object[n4];
                            n4 = (int)(((String)object2).contentEquals((CharSequence)object4) ? 1 : 0);
                            if (n4 != 0 || (n3 = (int)(((String)object2).contentEquals((CharSequence)object) ? 1 : 0)) != 0) {
                                object = new Exception();
                                throw object;
                            }
                            object2 = UUID.fromString((String)object4);
                            object3 = new Pair(object2, object);
                            break block10;
                        }
                        catch (Exception exception) {}
                        n4 = 0;
                        object3 = null;
                    }
                    if (object3 == null) {
                        object = new FileNotFoundException();
                        throw object;
                    }
                    try {
                        object = ((Pair)object3).first;
                        object = (UUID)object;
                        object2 = ((Pair)object3).second;
                        object2 = (String)object2;
                        object3 = ls1_1.a;
                        n4 = (int)(lz3_0.A((String)object2) ? 1 : 0);
                        if (n4 != 0 || object == null) break block11;
                    }
                    catch (FileNotFoundException fileNotFoundException2) {}
                    try {
                        object = ls1_1.d((UUID)object, (String)object2, false);
                        if (object == null) break block12;
                        n3 = 0x10000000;
                    }
                    catch (IOException iOException) {}
                    return ParcelFileDescriptor.open((File)object, (int)n3);
                    break block13;
                }
                object = new FileNotFoundException();
                throw object;
            }
            object = new FileNotFoundException();
            throw object;
        }
        ((Object)fileNotFoundException2).toString();
        throw fileNotFoundException2;
        object = new FileNotFoundException();
        throw object;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}

