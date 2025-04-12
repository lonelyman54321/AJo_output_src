/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.ParcelFileDescriptor
 *  android.text.TextUtils
 *  android.webkit.MimeTypeMap
 *  org.xmlpull.v1.XmlPullParserException
 */
package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider$a;
import androidx.core.content.FileProvider$b;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider
extends ContentProvider {
    public static final String[] e;
    public static final File f;
    public static final HashMap g;
    public final Object a;
    public String b;
    public FileProvider$a c;
    public final int d;

    static {
        Serializable serializable;
        e = new String[]{"_display_name", "_size"};
        f = serializable = new File("/");
        serializable = new HashMap();
        g = serializable;
    }

    public FileProvider() {
        Object object;
        this.a = object = new Object();
        this.d = 0;
    }

    public static String a(String string2) {
        int n3 = string2.length();
        if (n3 > 0) {
            int n4;
            n3 = string2.length() + -1;
            if ((n3 = (int)string2.charAt(n3)) == (n4 = 47)) {
                n3 = string2.length() + -1;
                n4 = 0;
                string2 = string2.substring(0, n3);
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FileProvider$a c(Context context, int n3, String string2) {
        HashMap hashMap = g;
        synchronized (hashMap) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        object = hashMap.get(string2);
                        object = (FileProvider$a)object;
                        if (object != null) break block6;
                        try {
                            object = FileProvider.e(context, n3, string2);
                            hashMap.put(string2, object);
                        }
                        catch (XmlPullParserException xmlPullParserException) {
                            string2 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, xmlPullParserException);
                            throw illegalArgumentException;
                        }
                        catch (IOException iOException) {
                            string2 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2, iOException);
                            throw illegalArgumentException;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static Uri d(Context context, String string2, File file) {
        return FileProvider.c(context, 0, string2).a(file);
    }

    public static FileProvider$b e(Context object, int n3, String object2) {
        FileProvider$b fileProvider$b = new FileProvider$b((String)object2);
        Object object3 = object.getPackageManager();
        int n4 = 128;
        if ((object3 = object3.resolveContentProvider((String)object2, n4)) != null) {
            object2 = ((ProviderInfo)object3).metaData;
            n4 = 1;
            String string2 = "android.support.FILE_PROVIDER_PATHS";
            if (object2 == null && n3 != 0) {
                object2 = new Bundle(n4);
                ((ProviderInfo)object3).metaData = object2;
                object2.putInt(string2, n3);
            }
            Object object4 = object.getPackageManager();
            if ((object4 = object3.loadXmlMetaData(object4, string2)) != null) {
                int n7;
                while ((n7 = object4.next()) != n4) {
                    int n8 = 2;
                    if (n7 != n8) continue;
                    object2 = object4.getName();
                    n8 = 0;
                    object3 = null;
                    string2 = object4.getAttributeValue(null, "name");
                    Object string3 = object4.getAttributeValue(null, "path");
                    Object object5 = "root-path";
                    int n10 = ((String)object5).equals(object2);
                    int n14 = 0;
                    if (n10 != 0) {
                        object3 = f;
                    } else {
                        object5 = "files-path";
                        n10 = ((String)object5).equals(object2);
                        if (n10 != 0) {
                            object3 = object.getFilesDir();
                        } else {
                            object5 = "cache-path";
                            n10 = ((String)object5).equals(object2);
                            if (n10 != 0) {
                                object3 = object.getCacheDir();
                            } else {
                                object5 = "external-path";
                                n10 = ((String)object5).equals(object2);
                                if (n10 != 0) {
                                    object3 = Environment.getExternalStorageDirectory();
                                } else {
                                    object5 = "external-files-path";
                                    n10 = ((String)object5).equals(object2);
                                    if (n10 != 0) {
                                        object2 = t70.getExternalFilesDirs((Context)object, null);
                                        n10 = ((Object)object2).length;
                                        if (n10 > 0) {
                                            object3 = object2[0];
                                        }
                                    } else {
                                        object5 = "external-cache-path";
                                        n10 = ((String)object5).equals(object2);
                                        if (n10 != 0) {
                                            object2 = t70.getExternalCacheDirs((Context)object);
                                            n10 = ((Object)object2).length;
                                            if (n10 > 0) {
                                                object3 = object2[0];
                                            }
                                        } else {
                                            object5 = "external-media-path";
                                            n7 = (int)(((String)object5).equals(object2) ? 1 : 0);
                                            if (n7 != 0 && (n10 = ((Object)(object2 = object.getExternalMediaDirs())).length) > 0) {
                                                object3 = object2[0];
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (object3 == null) continue;
                    object2 = new String[]{string3};
                    while (n14 < n4) {
                        string3 = object2[n14];
                        if (string3 != null) {
                            object3 = object5 = new File((File)object3, (String)string3);
                        }
                        ++n14;
                    }
                    n7 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                    if (n7 == 0) {
                        try {
                            object2 = ((File)object3).getCanonicalFile();
                            object3 = fileProvider$b.b;
                            ((HashMap)object3).put(string2, object2);
                        }
                        catch (IOException iOException) {
                            object2 = new StringBuilder("Failed to resolve canonical path for ");
                            ((StringBuilder)object2).append(object3);
                            object2 = ((StringBuilder)object2).toString();
                            object4 = new IllegalArgumentException((String)object2, iOException);
                            throw object4;
                        }
                        continue;
                    }
                    object = new IllegalArgumentException("Name must not be empty");
                    throw object;
                }
                return fileProvider$b;
            }
            object = new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            throw object;
        }
        String string4 = kp1_0.c("Couldn't find meta-data for provider with authority ", (String)object2);
        object = new IllegalArgumentException(string4);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void attachInfo(Context object, ProviderInfo object2) {
        super.attachInfo(object, object2);
        boolean bl2 = object2.exported;
        if (bl2) {
            object = new SecurityException("Provider must not be exported");
            throw object;
        }
        bl2 = object2.grantUriPermissions;
        if (bl2) {
            object = object2.authority.split(";")[0];
            object2 = this.a;
            synchronized (object2) {
                this.b = object;
            }
            HashMap hashMap = g;
            synchronized (hashMap) {
                hashMap.remove(object);
                return;
            }
        }
        object = new SecurityException("Provider must grant uri permissions");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final FileProvider$a b() {
        Object object = this.a;
        synchronized (object) {
            try {
                Object object2 = this.b;
                String string2 = "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?";
                if (object2 == null) {
                    object2 = new NullPointerException(string2);
                    throw object2;
                }
                object2 = this.c;
                if (object2 != null) return this.c;
                object2 = this.getContext();
                string2 = this.b;
                int n3 = this.d;
                this.c = object2 = FileProvider.c((Context)object2, n3, string2);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final int delete(Uri uri, String string2, String[] stringArray) {
        return (int)(this.b().b(uri).delete() ? 1 : 0);
    }

    public final String getType(Uri object) {
        int n3;
        object = this.b().b((Uri)object);
        String string2 = ((File)object).getName();
        int n4 = string2.lastIndexOf(n3 = 46);
        if (n4 >= 0) {
            object = ((File)object).getName();
            object = ((String)object).substring(++n4);
            string2 = MimeTypeMap.getSingleton();
            object = string2.getMimeTypeFromExtension((String)object);
            if (object != null) {
                return object;
            }
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public final Uri insert(Uri object, ContentValues contentValues) {
        object = new UnsupportedOperationException("No external inserts");
        throw object;
    }

    public final boolean onCreate() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ParcelFileDescriptor openFile(Uri object, String string2) {
        int n3;
        String string3;
        File file = this.b().b((Uri)object);
        String string4 = "r";
        boolean bl2 = string4.equals(string3);
        if (bl2) {
            n3 = 0x10000000;
            return ParcelFileDescriptor.open((File)file, (int)n3);
        }
        string4 = "w";
        bl2 = string4.equals(string3);
        if (!bl2 && !(bl2 = (string4 = "wt").equals(string3))) {
            string4 = "wa";
            bl2 = string4.equals(string3);
            if (bl2) {
                n3 = 0x2A000000;
                return ParcelFileDescriptor.open((File)file, (int)n3);
            }
            string4 = "rw";
            bl2 = string4.equals(string3);
            if (bl2) {
                n3 = 0x38000000;
                return ParcelFileDescriptor.open((File)file, (int)n3);
            }
            string4 = "rwt";
            bl2 = string4.equals(string3);
            if (bl2) {
                n3 = 0x3C000000;
                return ParcelFileDescriptor.open((File)file, (int)n3);
            }
            string3 = kp1_0.c("Invalid mode: ", string3);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        n3 = 0x2C000000;
        return ParcelFileDescriptor.open((File)file, (int)n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Cursor query(Uri stringArray, String[] objectArray, String object, String[] object2, String objectArray2) {
        object = this.b().b((Uri)stringArray);
        String string2 = "displayName";
        stringArray = stringArray.getQueryParameter(string2);
        if (objectArray == null) {
            objectArray = e;
        }
        int n3 = objectArray.length;
        String[] stringArray2 = new String[n3];
        int n4 = objectArray.length;
        Object[] objectArray3 = new Object[n4];
        int n7 = objectArray.length;
        int n8 = 0;
        int n10 = 0;
        while (true) {
            block10: {
                int n14;
                block9: {
                    Object object3;
                    block8: {
                        void var12_18;
                        if (n8 >= n7) {
                            stringArray = new String[n10];
                            System.arraycopy(stringArray2, 0, stringArray, 0, n10);
                            objectArray = new Object[n10];
                            System.arraycopy(objectArray3, 0, objectArray, 0, n10);
                            object = new MatrixCursor(stringArray, 1);
                            object.addRow(objectArray);
                            return object;
                        }
                        String string3 = "_display_name";
                        object3 = objectArray[n8];
                        boolean bl2 = string3.equals(object3);
                        if (!bl2) break block8;
                        stringArray2[n10] = string3;
                        n14 = n10 + 1;
                        if (stringArray == null) {
                            String string4 = ((File)object).getName();
                        } else {
                            String[] stringArray3 = stringArray;
                        }
                        objectArray3[n10] = var12_18;
                        break block9;
                    }
                    String string5 = "_size";
                    n14 = string5.equals(object3);
                    if (n14 == 0) break block10;
                    stringArray2[n10] = string5;
                    n14 = n10 + 1;
                    long l2 = ((File)object).length();
                    Long l3 = l2;
                    objectArray3[n10] = l3;
                }
                n10 = n14;
            }
            ++n8;
        }
    }

    public final int update(Uri object, ContentValues contentValues, String string2, String[] stringArray) {
        object = new UnsupportedOperationException("No external updates");
        throw object;
    }
}

