/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.util.Base64
 */
package com.jpl.crasdk.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Base64;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class CRAContentProvider
extends ContentProvider {
    public static String a(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            Charset charset;
            try {
                Intrinsics.checkNotNull(object);
                charset = Charsets.UTF_8;
            }
            catch (Exception exception) {}
            object = ((String)object).getBytes(charset);
            String string2 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            string2 = null;
            object = Base64.encode((byte[])object, (int)0);
            string2 = "encode(value!!.toByteArray(), Base64.DEFAULT)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            string2 = new String((byte[])object, charset);
            return string2;
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int delete(Uri uri, String string2, String[] object) {
        block12: {
            block11: {
                block10: {
                    String string3;
                    string2 = "uri";
                    Intrinsics.checkNotNullParameter(uri, string2);
                    uri = null;
                    try {
                        string2 = this.getContext();
                        if (string2 == null) break block10;
                        string3 = "cra_data_pref";
                    }
                    catch (Exception exception) {
                        return 0;
                    }
                    string2 = string2.getSharedPreferences(string3, 0);
                    break block11;
                }
                string2 = null;
            }
            if (string2 != null) {
                string2 = string2.edit();
                if (string2 == null) break block12;
                string2 = string2.clear();
                if (string2 == null) break block12;
                string2.commit();
            }
        }
        string2 = "TAG";
        String string4 = "CRA DATA DELETED";
        String string5 = "tag";
        Intrinsics.checkNotNullParameter(string2, string5);
        string2 = "msg";
        Intrinsics.checkNotNullParameter(string4, string2);
        return 0;
    }

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Uri insert(Uri uri, ContentValues object) {
        String string2;
        String string3;
        String string4;
        block29: {
            String string5;
            String string6;
            block28: {
                block27: {
                    int n3;
                    block26: {
                        block25: {
                            string4 = "CRA_DATA_2";
                            string3 = "CRA_DATA_1";
                            string2 = "uri";
                            Intrinsics.checkNotNullParameter(uri, string2);
                            uri = null;
                            try {
                                string2 = this.getContext();
                                if (string2 == null) break block25;
                                string6 = "cra_data_pref";
                                n3 = 0;
                            }
                            catch (Exception exception) {
                                return null;
                            }
                            string2 = string2.getSharedPreferences(string6, 0);
                            break block26;
                        }
                        string2 = null;
                    }
                    if (string2 != null) {
                        string2 = string2.edit();
                    } else {
                        string2 = null;
                    }
                    Intrinsics.checkNotNull(object);
                    string6 = object.getAsString(string3);
                    string6 = CRAContentProvider.a(string6);
                    String string5 = object.getAsString(string4);
                    string5 = CRAContentProvider.a(string5);
                    n3 = string6.length();
                    if (n3 == 0) break block27;
                    n3 = string5.length();
                    if (n3 != 0) break block28;
                }
                String string8 = "";
                if (string2 != null) {
                    string2.putString(string3, string8);
                }
                if (string2 == null) break block29;
                string2.putString(string4, string8);
                break block29;
            }
            if (string2 != null) {
                string2.putString(string3, string6);
            }
            if (string2 != null) {
                string2.putString(string4, string5);
            }
        }
        if (string2 != null) {
            string2.commit();
        }
        String string9 = "TAG";
        string4 = "CRA DATA INSERTED";
        string3 = "tag";
        Intrinsics.checkNotNullParameter(string9, string3);
        String string10 = "msg";
        Intrinsics.checkNotNullParameter(string4, string10);
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] object, String string2, String[] object2, String string3) {
        String string4;
        int n3;
        block19: {
            block18: {
                n3 = 0;
                object = null;
                string2 = "uri";
                Intrinsics.checkNotNullParameter(uri, string2);
                uri = null;
                try {
                    string2 = this.getContext();
                    if (string2 == null) break block18;
                    object2 = "cra_data_pref";
                }
                catch (Exception exception) {
                    return null;
                }
                string2 = string2.getSharedPreferences((String)object2, 0);
                break block19;
            }
            string2 = null;
        }
        object2 = "";
        string3 = "CRA_DATA_1";
        if (string2 != null) {
            string4 = string2.getString(string3, (String)object2);
        } else {
            string4 = null;
        }
        String string5 = "CRA_DATA_2";
        if (string2 != null) {
            string2 = string2.getString(string5, (String)object2);
        } else {
            string2 = null;
        }
        object2 = new String[]{string3, string5};
        string3 = new MatrixCursor(object2);
        int n4 = 2;
        object2 = new Object[n4];
        object2[0] = string4;
        n3 = 1;
        object2[n3] = string2;
        string3.addRow((Object[])object2);
        object = "TAG";
        string2 = "CRA DATA SELECTED";
        object2 = "tag";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = "msg";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        return string3;
    }

    public final int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}

