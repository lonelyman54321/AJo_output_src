/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build$VERSION
 */
package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class HeartBeatInfoStorage {
    private static final String GLOBAL = "fire-global";
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String LAST_STORED_DATE = "last-used-date";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String string2) {
        StringBuilder stringBuilder = new StringBuilder(HEARTBEAT_PREFERENCES_NAME);
        stringBuilder.append(string2);
        string2 = stringBuilder.toString();
        context = context.getSharedPreferences(string2, 0);
        this.firebaseSharedPreferences = context;
    }

    public HeartBeatInfoStorage(SharedPreferences sharedPreferences2) {
        this.firebaseSharedPreferences = sharedPreferences2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void cleanUpStoredHeartBeats() {
        synchronized (this) {
            block9: {
                block8: {
                    block7: {
                        try {
                            var1_1 = this.firebaseSharedPreferences;
                            var2_3 = "fire-count";
                            var3_4 = 0L;
                            var5_5 = var1_1.getLong(var2_3, var3_4);
                            var7_6 /* !! */  = "";
                            var8_7 = this.firebaseSharedPreferences;
                            var8_7 = var8_7.getAll();
                            var8_7 = var8_7.entrySet();
                            var8_7 = var8_7.iterator();
                            var9_8 /* !! */  = null;
lbl13:
                            // 3 sources

                            while (var10_9 = var8_7.hasNext()) {
                                var11_10 = var8_7.next();
                                break block7;
                            }
                            break block8;
                        }
                        catch (Throwable var1_2) {
                            break block9;
                        }
                    }
                    var12_11 = (var11_10 = (Map.Entry)var11_10).getValue();
                    var13_12 = var12_11 instanceof Set;
                    if (!var13_12) ** GOTO lbl13
                    var12_11 = var11_10.getValue();
                    var12_11 = (Set)var12_11;
                    var12_11 = var12_11.iterator();
                    while (var14_13 = var12_11.hasNext()) {
                        var15_14 /* !! */  = var12_11.next();
                        var15_14 /* !! */  = (String)var15_14 /* !! */ ;
                        if (var9_8 /* !! */  != null && (var16_15 = var9_8 /* !! */ .compareTo((String)var15_14 /* !! */ )) <= 0) continue;
                        var7_6 /* !! */  = var11_10.getKey();
                        var9_8 /* !! */  = var15_14 /* !! */ ;
                    }
                    ** GOTO lbl13
                }
                var11_10 = this.firebaseSharedPreferences;
                var12_11 = new HashSet();
                var11_10 = var11_10.getStringSet(var7_6 /* !! */ , var12_11);
                var8_7 = new HashSet(var11_10);
                var8_7.remove(var9_8 /* !! */ );
                var9_8 /* !! */  = this.firebaseSharedPreferences;
                var9_8 /* !! */  = var9_8 /* !! */ .edit();
                var7_6 /* !! */  = var9_8 /* !! */ .putStringSet(var7_6 /* !! */ , (Set)var8_7);
                var8_7 = "fire-count";
                var17_16 = 1L;
                {
                    var1_1 = var7_6 /* !! */ .putLong((String)var8_7, var5_5 -= var17_16);
                    var1_1.commit();
                    return;
                }
            }
            throw var1_2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getFormattedDate(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    int n3 = Build.VERSION.SDK_INT;
                    int n4 = 26;
                    if (n3 >= n4) {
                        Date date = new Date(l2);
                        Object object = s41.a(date);
                        Object object2 = t41_0.a();
                        object = u41.a((Instant)object, (ZoneOffset)object2);
                        object = v41.a((OffsetDateTime)object);
                        object2 = w41.a();
                        return x41.a((LocalDateTime)object, (DateTimeFormatter)object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    Object object = "yyyy-MM-dd";
                    Locale locale = Locale.UK;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
                    object = new Date(l2);
                    return simpleDateFormat.format((Date)object);
                }
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getStoredUserAgentString(String var1_1) {
        synchronized (this) {
            block7: {
                try {
                    var2_3 = this.firebaseSharedPreferences;
                    var2_3 = var2_3.getAll();
                    var2_3 = var2_3.entrySet();
                    var2_3 = var2_3.iterator();
lbl7:
                    // 3 sources

                    while (true) {
                        var3_4 = var2_3.hasNext();
                        if (var3_4 == false) return null;
                        var4_5 = var2_3.next();
                        break;
                    }
                }
                catch (Throwable var1_2) {
                    break block7;
                }
                var5_6 /* !! */  = (var4_5 = (Map.Entry)var4_5).getValue();
                var6_7 = var5_6 /* !! */  instanceof Set;
                if (!var6_7) ** GOTO lbl7
                {
                    var5_6 /* !! */  = var4_5.getValue();
                    var5_6 /* !! */  = (Set)var5_6 /* !! */ ;
                    var5_6 /* !! */  = var5_6 /* !! */ .iterator();
                    do {
                        if (var7_8 = var5_6 /* !! */ .hasNext()) ** break;
                        ** continue;
                        var8_9 /* !! */  = var5_6 /* !! */ .next();
                    } while (!(var7_8 = var1_1 /* !! */ .equals(var8_9 /* !! */  = (String)var8_9 /* !! */ )));
                    return var4_5.getKey();
                }
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void removeStoredDate(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                String string3;
                block6: {
                    try {
                        string3 = this.getStoredUserAgentString(string2);
                        if (string3 != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                Object object = this.firebaseSharedPreferences;
                HashSet hashSet = new HashSet();
                object = object.getStringSet(string3, hashSet);
                HashSet hashSet2 = new HashSet(object);
                hashSet2.remove(string2);
                boolean bl2 = hashSet2.isEmpty();
                if (bl2) {
                    string2 = this.firebaseSharedPreferences;
                    string2 = string2.edit();
                    string2 = string2.remove(string3);
                    string2.commit();
                } else {
                    string2 = this.firebaseSharedPreferences;
                    string2 = string2.edit();
                    string2 = string2.putStringSet(string3, hashSet2);
                    string2.commit();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void updateStoredUserAgent(String string2, String string3) {
        synchronized (this) {
            this.removeStoredDate(string3);
            Object object = this.firebaseSharedPreferences;
            HashSet hashSet = new HashSet();
            object = object.getStringSet(string2, hashSet);
            HashSet<String> hashSet2 = new HashSet<String>((Collection<String>)object);
            hashSet2.add(string3);
            string3 = this.firebaseSharedPreferences;
            string3 = string3.edit();
            string2 = string3.putStringSet(string2, hashSet2);
            string2.commit();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void deleteAllHeartBeats() {
        synchronized (this) {
            block9: {
                block8: {
                    block10: {
                        block7: {
                            try {
                                var1_1 = this.firebaseSharedPreferences;
                                var1_1 = var1_1.edit();
                                var2_3 = this.firebaseSharedPreferences;
                                var2_3 = var2_3.getAll();
                                var2_3 = var2_3.entrySet();
                                var2_3 = var2_3.iterator();
                                var3_4 = 0;
lbl10:
                                // 4 sources

                                while (var4_5 = var2_3.hasNext()) {
                                    var5_6 /* !! */  = var2_3.next();
                                    break block7;
                                }
                                break block8;
                            }
                            catch (Throwable var1_2) {
                                break block9;
                            }
                        }
                        var6_7 /* !! */  = (var5_6 /* !! */  = (Map.Entry)var5_6 /* !! */ ).getValue();
                        var7_8 = var6_7 /* !! */  instanceof Set;
                        if (!var7_8) ** GOTO lbl10
                        var6_7 /* !! */  = var5_6 /* !! */ .getValue();
                        var6_7 /* !! */  = (Set)var6_7 /* !! */ ;
                        var8_9 = System.currentTimeMillis();
                        var10_10 = this.getFormattedDate(var8_9);
                        var5_6 /* !! */  = var5_6 /* !! */ .getKey();
                        var5_6 /* !! */  = (String)var5_6 /* !! */ ;
                        var7_8 = var6_7 /* !! */ .contains(var10_10);
                        if (!var7_8) break block10;
                        var6_7 /* !! */  = new HashSet();
                        var6_7 /* !! */ .add(var10_10);
                        ++var3_4;
                        var1_1.putStringSet(var5_6 /* !! */ , (Set)var6_7 /* !! */ );
                        ** GOTO lbl10
                    }
                    var1_1.remove(var5_6 /* !! */ );
                    ** GOTO lbl10
                }
                if (var3_4 == 0) {
                    var2_3 = "fire-count";
                    var1_1.remove((String)var2_3);
                } else {
                    var2_3 = "fire-count";
                    var11_11 = var3_4;
                    var1_1.putLong((String)var2_3, var11_11);
                }
                var1_1.commit();
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getAllHeartBeats() {
        synchronized (this) {
            block7: {
                block6: {
                    block5: {
                        try {
                            var1_1 = new ArrayList<E>();
                            var2_3 = this.firebaseSharedPreferences;
                            var2_3 = var2_3.getAll();
                            var2_3 = var2_3.entrySet();
                            var2_3 = var2_3.iterator();
lbl8:
                            // 4 sources

                            while (var3_4 = var2_3.hasNext()) {
                                var4_5 /* !! */  = var2_3.next();
                                break block5;
                            }
                            break block6;
                        }
                        catch (Throwable var1_2) {
                            break block7;
                        }
                    }
                    var5_6 /* !! */  = (var4_5 /* !! */  = (Map.Entry)var4_5 /* !! */ ).getValue();
                    var6_7 = var5_6 /* !! */  instanceof Set;
                    if (!var6_7) ** GOTO lbl8
                    var7_8 /* !! */  = var4_5 /* !! */ .getValue();
                    var7_8 /* !! */  = (Set)var7_8 /* !! */ ;
                    var5_6 /* !! */  = new HashSet(var7_8 /* !! */ );
                    var8_9 = System.currentTimeMillis();
                    var7_8 /* !! */  = this.getFormattedDate(var8_9);
                    var5_6 /* !! */ .remove(var7_8 /* !! */ );
                    var10_10 = var5_6 /* !! */ .isEmpty();
                    if (var10_10) ** GOTO lbl8
                    var4_5 /* !! */  = var4_5 /* !! */ .getKey();
                    var4_5 /* !! */  = (String)var4_5 /* !! */ ;
                    var7_8 /* !! */  = new V(var5_6 /* !! */ );
                    var4_5 /* !! */  = HeartBeatResult.create(var4_5 /* !! */ , var7_8 /* !! */ );
                    var1_1.add(var4_5 /* !! */ );
                    ** GOTO lbl8
                }
                var11_11 = System.currentTimeMillis();
                this.updateGlobalHeartBeat(var11_11);
                return var1_1;
            }
            throw var1_2;
        }
    }

    public int getHeartBeatCount() {
        return (int)this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getLastGlobalHeartBeat() {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = this.firebaseSharedPreferences;
            String string2 = GLOBAL;
            long l2 = -1;
            return sharedPreferences2.getLong(string2, l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isSameDateUtc(long l2, long l3) {
        synchronized (this) {
            String string2 = this.getFormattedDate(l2);
            String string3 = this.getFormattedDate(l3);
            return string2.equals(string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void postHeartBeatCleanUp() {
        synchronized (this) {
            long l2 = System.currentTimeMillis();
            String string2 = this.getFormattedDate(l2);
            SharedPreferences sharedPreferences2 = this.firebaseSharedPreferences;
            sharedPreferences2 = sharedPreferences2.edit();
            String string3 = LAST_STORED_DATE;
            sharedPreferences2 = sharedPreferences2.putString(string3, string2);
            sharedPreferences2.commit();
            this.removeStoredDate(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean shouldSendGlobalHeartBeat(long l2) {
        synchronized (this) {
            String string2 = GLOBAL;
            return this.shouldSendSdkHeartBeat(string2, l2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public boolean shouldSendSdkHeartBeat(String string2, long l2) {
        boolean bl2;
        SharedPreferences sharedPreferences2;
        block4: {
            block5: {
                // MONITORENTER : this
                sharedPreferences2 = this.firebaseSharedPreferences;
                boolean bl3 = sharedPreferences2.contains(string2);
                bl2 = true;
                if (!bl3) break block4;
                sharedPreferences2 = this.firebaseSharedPreferences;
                long l3 = -1;
                bl3 = this.isSameDateUtc(l3 = sharedPreferences2.getLong(string2, l3), l2);
                if (bl3) break block5;
                sharedPreferences2 = this.firebaseSharedPreferences;
                sharedPreferences2 = sharedPreferences2.edit();
                string2 = sharedPreferences2.putLong(string2, l2);
                string2.commit();
                // MONITOREXIT : this
                return bl2;
            }
            // MONITOREXIT : this
            return false;
        }
        sharedPreferences2 = this.firebaseSharedPreferences;
        sharedPreferences2 = sharedPreferences2.edit();
        string2 = sharedPreferences2.putLong(string2, l2);
        string2.commit();
        // MONITOREXIT : this
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void storeHeartBeat(long l2, String string2) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                long l3;
                long l4;
                Object object;
                HashSet hashSet;
                Object object2;
                Object object3;
                String string3;
                block6: {
                    block8: {
                        block7: {
                            try {
                                string3 = this.getFormattedDate(l2);
                                object3 = this.firebaseSharedPreferences;
                                object2 = LAST_STORED_DATE;
                                hashSet = "";
                                object3 = object3.getString((String)object2, (String)((Object)hashSet));
                                object = ((String)object3).equals(string3);
                                if (!object) break block6;
                                object3 = this.getStoredUserAgentString(string3);
                                if (object3 != null) break block7;
                            }
                            catch (Throwable throwable2) {}
                            return;
                        }
                        object = ((String)object3).equals(string2);
                        if (!object) break block8;
                        return;
                    }
                    this.updateStoredUserAgent(string2, string3);
                    return;
                    break block9;
                }
                object3 = this.firebaseSharedPreferences;
                object2 = HEART_BEAT_COUNT_TAG;
                long l7 = 0L;
                long l8 = object3.getLong((String)object2, l7);
                long l12 = l8 + (l4 = 1L);
                long l14 = l12 - (l3 = (long)30);
                object = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (!object) {
                    this.cleanUpStoredHeartBeats();
                    object3 = this.firebaseSharedPreferences;
                    object2 = HEART_BEAT_COUNT_TAG;
                    l8 = object3.getLong((String)object2, l7);
                }
                object2 = this.firebaseSharedPreferences;
                hashSet = new HashSet();
                object2 = object2.getStringSet(string2, hashSet);
                object3 = new HashSet(object2);
                ((HashSet)object3).add(string3);
                object2 = this.firebaseSharedPreferences;
                object2 = object2.edit();
                object3 = object2.putStringSet(string2, (Set)object3);
                string2 = HEART_BEAT_COUNT_TAG;
                object3 = object3.putLong(string2, l8 += l4);
                string2 = LAST_STORED_DATE;
                string3 = object3.putString(string2, string3);
                string3.commit();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateGlobalHeartBeat(long l2) {
        synchronized (this) {
            SharedPreferences sharedPreferences2 = this.firebaseSharedPreferences;
            sharedPreferences2 = sharedPreferences2.edit();
            String string2 = GLOBAL;
            SharedPreferences.Editor editor = sharedPreferences2.putLong(string2, l2);
            editor.commit();
            return;
        }
    }
}

