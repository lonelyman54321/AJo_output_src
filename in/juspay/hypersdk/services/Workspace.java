/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.AssetManager
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.services.Workspace$Companion;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public class Workspace {
    public static final Workspace$Companion Companion;
    private static final String FALLBACK_WORKSPACE = "juspay";
    private static final String TAG = "Workspace";
    private static SharedPreferences fallbackSharedPreferencesGodel;
    private static SharedPreferences fallbackSharedPreferencesJuspay;
    private final AssetManager assetManager;
    private final File cacheRoot;
    private final String path;
    private File root;
    private final List sharedPrefsList;

    static {
        Workspace$Companion workspace$Companion;
        Companion = workspace$Companion = new Workspace$Companion(null);
    }

    public Workspace(Context context, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(string2, "workspacePath");
        Object object = Companion;
        this.path = string2 = ((Workspace$Companion)object).trimFileSeparator(string2);
        Serializable serializable = Workspace$Companion.access$mkRoot((Workspace$Companion)object, context, string2);
        this.root = serializable;
        this.cacheRoot = object = Workspace$Companion.access$mkCacheRoot((Workspace$Companion)object, context, string2);
        char c2 = '/';
        char c3 = '_';
        object = b.o(string2, c2, c3);
        serializable = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(serializable, "ctx.assets");
        this.assetManager = serializable;
        SharedPreferences sharedPreferences2 = fallbackSharedPreferencesJuspay;
        String string3 = FALLBACK_WORKSPACE;
        if (sharedPreferences2 == null) {
            fallbackSharedPreferencesJuspay = sharedPreferences2 = context.getSharedPreferences(string3, 0);
        }
        if ((sharedPreferences2 = fallbackSharedPreferencesGodel) == null) {
            fallbackSharedPreferencesGodel = sharedPreferences2 = context.getSharedPreferences("godel", 0);
        }
        if (bl2 = Intrinsics.areEqual(string2, string3)) {
            context = fallbackSharedPreferencesJuspay;
            if (context != null) {
                ((ArrayList)serializable).add(context);
            }
            if ((context = fallbackSharedPreferencesGodel) != null) {
                ((ArrayList)serializable).add(context);
            }
        } else {
            context = context.getSharedPreferences((String)object, 0);
            ((ArrayList)serializable).add(context);
            context = fallbackSharedPreferencesJuspay;
            if (context != null) {
                ((ArrayList)serializable).add(context);
            }
            if ((context = fallbackSharedPreferencesGodel) != null) {
                ((ArrayList)serializable).add(context);
            }
        }
        this.sharedPrefsList = serializable;
    }

    public Workspace(Workspace workspace) {
        Intrinsics.checkNotNullParameter(workspace, "workspace");
        Object object = workspace.path;
        this.path = object;
        this.root = object = workspace.root;
        this.cacheRoot = object = workspace.cacheRoot;
        this.sharedPrefsList = object = workspace.sharedPrefsList;
        workspace = workspace.assetManager;
        this.assetManager = workspace;
    }

    private final void deleteLogFiles() {
        block14: {
            Object object = this.cacheRoot;
            object = ((File)object).toString();
            File[] fileArray = new File((String)object);
            fileArray = fileArray.listFiles();
            if (fileArray == null) break block14;
            int n3 = fileArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                File file;
                block15: {
                    try {
                        file = fileArray[i3];
                    }
                    catch (Exception exception) {}
                    String string2 = file.getName();
                    String string3 = "fileName";
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                    string3 = "juspay-logs-queue-";
                    boolean bl2 = b.s(string2, string3, false);
                    if (bl2) break block15;
                    string3 = "juspay-pre-logs-queue-";
                    bl2 = b.s(string2, string3, false);
                    if (bl2) break block15;
                    string3 = "temp-logs-queue-";
                    boolean bl3 = b.s(string2, string3, false);
                    if (!bl3) continue;
                }
                file.delete();
                continue;
                break;
            }
        }
    }

    private final File open(File file, String string2) {
        string2 = Companion.trimFileSeparator(string2);
        File file2 = new File(file, string2);
        return file2;
    }

    public final void clean(Context object) {
        Intrinsics.checkNotNullParameter(object, "ctx");
        Object object2 = this.root;
        boolean bl2 = ((File)object2).exists();
        if (bl2) {
            Utils.deleteRecursive(this.root);
            object2 = Companion;
            String string2 = this.path;
            Workspace$Companion.access$mkRoot((Workspace$Companion)object2, (Context)object, string2);
        }
        object2 = this.cacheRoot;
        object = new File((File)object2, "juspay-logs-queue.dat");
        ((File)object).delete();
        object2 = this.cacheRoot;
        object = new File((File)object2, "temp-logs-queue.dat");
        ((File)object).delete();
        object2 = this.cacheRoot;
        object = new File((File)object2, "juspay-pre-logs-queue.dat");
        ((File)object).delete();
        this.deleteLogFiles();
    }

    public final File getCacheRoot() {
        return this.cacheRoot;
    }

    public final String getFromSharedPreference(String string2, String string3) {
        boolean bl2;
        Iterator iterator = this.sharedPrefsList.iterator();
        while (bl2 = iterator.hasNext()) {
            String string4 = ((SharedPreferences)iterator.next()).getString(string2, null);
            if (string4 == null) continue;
            return string4;
        }
        return string3;
    }

    public final Set getKeysInSharedPreference() {
        boolean bl2;
        HashSet hashSet = new HashSet();
        Iterator iterator = this.sharedPrefsList.iterator();
        while (bl2 = iterator.hasNext()) {
            Set set = ((SharedPreferences)iterator.next()).getAll().keySet();
            hashSet.addAll(set);
        }
        return hashSet;
    }

    public final String getPath() {
        return this.path;
    }

    public final File getRoot() {
        return this.root;
    }

    public final boolean isInSharedPreference(String string2) {
        boolean bl2;
        Iterator iterator = this.sharedPrefsList.iterator();
        while (bl2 = iterator.hasNext()) {
            SharedPreferences sharedPreferences2 = (SharedPreferences)iterator.next();
            bl2 = sharedPreferences2.contains(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final File open(String string2) {
        Intrinsics.checkNotNullParameter(string2, "filePath");
        File file = this.root;
        return this.open(file, string2);
    }

    public final InputStream openAsset(String string2) {
        IOException iOException2;
        block9: {
            Intrinsics.checkNotNullParameter(string2, "filePath");
            Object object = Companion;
            string2 = ((Workspace$Companion)object).trimFileSeparator(string2);
            object = this.assetManager;
            CharSequence charSequence = new StringBuilder();
            String string3 = this.path;
            ((StringBuilder)charSequence).append(string3);
            char c2 = '/';
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
            object = object.open((String)charSequence);
            charSequence = "{\n            assetManag\u2026path/$trimmed\")\n        }";
            try {
                Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
            }
            catch (IOException iOException2) {
                charSequence = this.path;
                string3 = FALLBACK_WORKSPACE;
                boolean bl2 = Intrinsics.areEqual(charSequence, string3);
                if (bl2) break block9;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(iOException2);
                ((StringBuilder)charSequence).append(", trying fallback workspace.");
                object = ((StringBuilder)charSequence).toString();
                JuspayLogger.d(TAG, (String)object);
                object = this.assetManager;
                string3 = "juspay/";
                charSequence = new StringBuilder(string3);
                ((StringBuilder)charSequence).append(string2);
                string2 = ((StringBuilder)charSequence).toString();
                object = object.open(string2);
                string2 = "{\n            if (path !\u2026e\n            }\n        }";
                Intrinsics.checkNotNullExpressionValue(object, string2);
            }
            return object;
        }
        throw iOException2;
    }

    public final File openInCache(String string2) {
        Intrinsics.checkNotNullParameter(string2, "filePath");
        File file = this.cacheRoot;
        return this.open(file, string2);
    }

    public final Unit removeFromSharedPreference(String object) {
        if (object != null) {
            boolean bl2;
            Iterator iterator = this.sharedPrefsList.iterator();
            while (bl2 = iterator.hasNext()) {
                SharedPreferences.Editor editor = ((SharedPreferences)iterator.next()).edit();
                if (editor == null || (editor = editor.remove((String)object)) == null) continue;
                editor.apply();
            }
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }

    public final void setRoot(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.root = file;
    }

    public final Unit writeToSharedPreference(String object, String string2) {
        if (object != null) {
            SharedPreferences.Editor editor = ((SharedPreferences)this.sharedPrefsList.get(0)).edit();
            editor.putString((String)object, string2).apply();
            object = Unit.a;
        } else {
            object = null;
        }
        return object;
    }
}

