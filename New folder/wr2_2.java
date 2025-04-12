/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentValues
 *  android.content.Intent
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.impl.DefaultBadger;

/*
 * Renamed from WR2
 */
public final class wr2_2
implements mu_1 {
    public static final String[] b = new String[]{"_id", "class"};
    public final DefaultBadger a;

    public wr2_2() {
        DefaultBadger defaultBadger;
        this.a = defaultBadger = new DefaultBadger();
    }

    public static ContentValues c(ComponentName object, int n3, boolean bl2) {
        ContentValues contentValues = new ContentValues();
        if (bl2) {
            String string2 = object.getPackageName();
            String string3 = "package";
            contentValues.put(string3, string2);
            string2 = "class";
            object = object.getClassName();
            contentValues.put(string2, (String)object);
        }
        object = n3;
        contentValues.put("badgecount", (Integer)object);
        return contentValues;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(AJIOApplication aJIOApplication, ComponentName componentName, int n3) {
        Throwable throwable2;
        Cursor cursor;
        block12: {
            block11: {
                boolean bl2;
                int n4;
                Object object;
                Object object2;
                DefaultBadger defaultBadger;
                block13: {
                    block14: {
                        defaultBadger = this.a;
                        if (defaultBadger == null) break block13;
                        object2 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                        object = aJIOApplication.getPackageManager();
                        object2 = object.queryBroadcastReceivers((Intent)object2, 0);
                        if (object2 == null) {
                            object2 = Collections.emptyList();
                        }
                        int n7 = object2.size();
                        if (n7 > 0) break block14;
                        n7 = Build.VERSION.SDK_INT;
                        n4 = 26;
                        if (n7 < n4) break block13;
                        object2 = new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
                        object = aJIOApplication.getPackageManager();
                        object2 = object.queryBroadcastReceivers((Intent)object2, 0);
                        if (object2 == null) {
                            object2 = Collections.emptyList();
                        }
                        n7 = object2.size();
                        if (n7 <= 0) break block13;
                    }
                    defaultBadger.a(aJIOApplication, componentName, n3);
                    return;
                }
                defaultBadger = Uri.parse((String)"content://com.sec.badge/apps?notify=true");
                aJIOApplication = aJIOApplication.getContentResolver();
                cursor = null;
                try {
                    Object object3 = b;
                    String string2 = "package=?";
                    object2 = componentName.getPackageName();
                    String[] stringArray = new String[]{object2};
                    String string3 = null;
                    object2 = aJIOApplication;
                    object = defaultBadger;
                    cursor = aJIOApplication.query((Uri)defaultBadger, (String[])object3, string2, stringArray, null);
                    if (cursor == null) break block11;
                    object2 = componentName.getClassName();
                    n4 = 0;
                    object = null;
                    while (true) {
                        int n8 = cursor.moveToNext();
                        bl2 = true;
                        if (n8 != 0) {
                            n8 = cursor.getInt(0);
                            stringArray = wr2_2.c(componentName, n3, false);
                            string3 = "_id=?";
                            object3 = String.valueOf(n8);
                            object3 = new String[]{object3};
                            aJIOApplication.update((Uri)defaultBadger, (ContentValues)stringArray, string3, (String[])object3);
                            object3 = "class";
                            n8 = cursor.getColumnIndex((String)object3);
                            object3 = cursor.getString(n8);
                            if ((n8 = (int)(((String)object2).equals(object3) ? 1 : 0)) == 0) continue;
                            n4 = 1;
                            continue;
                        }
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                if (n4 == 0) {
                    componentName = wr2_2.c(componentName, n3, bl2);
                    aJIOApplication.insert((Uri)defaultBadger, (ContentValues)componentName);
                }
            }
            if (cursor == null) return;
            boolean bl3 = cursor.isClosed();
            if (bl3) return;
            cursor.close();
            return;
        }
        if (cursor == null) throw throwable2;
        boolean bl4 = cursor.isClosed();
        if (bl4) throw throwable2;
        cursor.close();
        throw throwable2;
    }

    public final List b() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}

