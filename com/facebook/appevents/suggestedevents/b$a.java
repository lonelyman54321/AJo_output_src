/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.appevents.suggestedevents;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$c;
import com.facebook.appevents.g;
import com.facebook.appevents.suggestedevents.a;
import com.facebook.appevents.suggestedevents.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$a {
    public static final boolean a(String object, String string2) {
        boolean bl2;
        Object object2;
        block9: {
            Class<ox2_1> clazz = b.e;
            clazz = ox2_1.a;
            clazz = ox2_1.class;
            boolean bl3 = td0.b(clazz);
            object2 = null;
            if (!bl3) {
                Object object3 = "pathID";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = ox2_1.b;
                boolean bl4 = object3.containsKey(object);
                if (!bl4) break block9;
                object = ((LinkedHashMap)object3).get(object);
                try {
                    object2 = object = (String)object;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
        if (object2 == null) {
            bl2 = false;
            object = null;
        } else {
            object = "other";
            bl2 = Intrinsics.areEqual(object2, object);
            if (!bl2) {
                object = new td3_1((String)object2, string2);
                lz3_0.L((Runnable)object);
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(View object, View object2, String object3) {
        block26: {
            HashSet hashSet;
            Object object4;
            int n3;
            block24: {
                Object object5;
                boolean bl2;
                block19: {
                    Intrinsics.checkNotNullParameter(object, "hostView");
                    Intrinsics.checkNotNullParameter(object2, "rootView");
                    String string2 = "activityName";
                    Intrinsics.checkNotNullParameter(object3, string2);
                    n3 = object.hashCode();
                    object4 = b.e;
                    object4 = b.class;
                    bl2 = td0.b(object4);
                    hashSet = null;
                    if (!bl2) {
                        try {
                            object5 = b.e;
                            break block19;
                        }
                        catch (Throwable throwable) {
                            td0.a(object4, throwable);
                        }
                    }
                    bl2 = false;
                    object5 = null;
                }
                AnnotatedElement annotatedElement = Integer.valueOf(n3);
                bl2 = ((HashSet)object5).contains(annotatedElement);
                if (bl2) break block26;
                object5 = new b((View)object, (View)object2, (String)object3);
                object2 = xc3_0.class;
                boolean bl3 = td0.b(object2);
                if (!bl3) {
                    Throwable throwable222;
                    block25: {
                        block22: {
                            block23: {
                                boolean bl4;
                                object3 = "view";
                                try {
                                    block20: {
                                        block21: {
                                            Intrinsics.checkNotNullParameter(object, (String)object3);
                                            object3 = "android.view.View";
                                            object3 = Class.forName((String)object3);
                                            annotatedElement = "mListenerInfo";
                                            object3 = ((Class)object3).getDeclaredField((String)((Object)annotatedElement));
                                            annotatedElement = "android.view.View$ListenerInfo";
                                            try {
                                                annotatedElement = Class.forName((String)((Object)annotatedElement));
                                                String string3 = "mOnClickListener";
                                                annotatedElement = ((Class)annotatedElement).getDeclaredField(string3);
                                                break block20;
                                            }
                                            catch (ClassNotFoundException | NoSuchFieldException reflectiveOperationException) {
                                                break block21;
                                            }
                                            catch (ClassNotFoundException | NoSuchFieldException reflectiveOperationException) {
                                                bl3 = false;
                                                object3 = null;
                                            }
                                        }
                                        annotatedElement = null;
                                    }
                                    if (object3 == null || annotatedElement == null) break block22;
                                    bl4 = true;
                                }
                                catch (Throwable throwable222) {
                                    break block25;
                                }
                                {
                                    ((AccessibleObject)object3).setAccessible(bl4);
                                    ((AccessibleObject)annotatedElement).setAccessible(bl4);
                                    try {
                                        ((AccessibleObject)object3).setAccessible(bl4);
                                        object3 = ((Field)object3).get(object);
                                    }
                                    catch (IllegalAccessException illegalAccessException) {
                                        bl3 = false;
                                        object3 = null;
                                    }
                                    if (object3 != null) break block23;
                                }
                                try {
                                    object.setOnClickListener((View.OnClickListener)object5);
                                    break block24;
                                }
                                catch (Exception exception) {
                                    break block24;
                                }
                            }
                            ((Field)annotatedElement).set(object3, object5);
                            break block24;
                        }
                        object.setOnClickListener((View.OnClickListener)object5);
                        break block24;
                    }
                    td0.a(object2, throwable222);
                }
            }
            boolean bl5 = td0.b(object4);
            if (!bl5) {
                try {
                    hashSet = b.e;
                }
                catch (Throwable throwable) {
                    td0.a(object4, throwable);
                }
            }
            object = n3;
            hashSet.add(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String object, String string2, float[] object2) {
        boolean bl2;
        Object[] objectArray;
        Object object3;
        int n3;
        block15: {
            String string3;
            boolean bl3;
            g g3;
            block14: {
                g3 = null;
                n3 = 1;
                object3 = a.a;
                object3 = a.class;
                bl3 = td0.b(object3);
                string3 = "event";
                if (!bl3) {
                    try {
                        Intrinsics.checkNotNullParameter(object, string3);
                        objectArray = a.c;
                        bl3 = objectArray.contains(object);
                        break block14;
                    }
                    catch (Throwable throwable) {
                        td0.a(object3, throwable);
                    }
                }
                bl3 = false;
                objectArray = null;
            }
            if (bl3) {
                Context context = FacebookSdk.a();
                g3 = new g(context, null);
                String string4 = "loggerImpl";
                Intrinsics.checkNotNullParameter(g3, string4);
                boolean bl4 = td0.b(g3);
                if (bl4) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    String string5 = "_is_suggested_event";
                    object3 = "1";
                    bundle.putString(string5, (String)object3);
                    string5 = "_button_text";
                    bundle.putString(string5, string2);
                    g3.e((String)object, bundle);
                    return;
                }
                catch (Throwable throwable) {
                    td0.a(g3, throwable);
                    return;
                }
            }
            bl3 = td0.b(object3);
            if (!bl3) {
                try {
                    Intrinsics.checkNotNullParameter(object, string3);
                    objectArray = a.d;
                    bl2 = objectArray.contains(object);
                    break block15;
                }
                catch (Throwable throwable) {
                    td0.a(object3, throwable);
                }
            }
            bl2 = false;
            object3 = null;
        }
        if (!bl2) return;
        object3 = new Bundle();
        objectArray = "event_name";
        try {
            object3.putString((String)objectArray, (String)object);
            object = new JSONObject();
            objectArray = new StringBuilder();
            int n4 = ((float[])object2).length;
            int n7 = 0;
            while (true) {
                if (n7 >= n4) {
                    String string6 = "dense";
                    objectArray = objectArray.toString();
                    object.put(string6, (Object)objectArray);
                    String string7 = "button_text";
                    object.put(string7, (Object)string2);
                    string2 = "metadata";
                    object = object.toString();
                    object3.putString(string2, (String)object);
                    object = GraphRequest.j;
                    object = StringCompanionObject.INSTANCE;
                    object = Locale.US;
                    string2 = "%s/suggested_events";
                    String string8 = FacebookSdk.b();
                    objectArray = new Object[n3];
                    objectArray[0] = string8;
                    Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
                    object = String.format((Locale)object, string2, objectArray2);
                    string2 = "format(locale, format, *args)";
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    object = GraphRequest$c.i(null, (String)object, null, null);
                    string2 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object3, string2);
                    ((GraphRequest)object).d = object3;
                    ((GraphRequest)object).c();
                    return;
                }
                float f5 = object2[n7];
                objectArray.append(f5);
                String string9 = ",";
                objectArray.append(string9);
                n7 += n3;
            }
        }
        catch (JSONException jSONException) {
            return;
        }
    }
}

