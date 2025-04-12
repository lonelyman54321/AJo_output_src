/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.services.data.Cart.CartModification;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.utils.JsonUtils$getAssociatedTypeFromClass$1;
import com.ril.ajio.services.utils.JsonUtils$getAssociatedTypeFromClass$2;
import com.ril.ajio.services.utils.JsonUtils$getAssociatedTypeFromClass$3;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class JsonUtils {
    private static final String ERROR_MESSAGE_JSON = "{\"errors\":[{\"message\":\"MSG_TO_REPLACE\", \"type\":\"TYPE_TO_REPLACE\"}]}";
    public static final JsonUtils INSTANCE;
    private static final String MSG_TO_REPLACE = "MSG_TO_REPLACE";
    private static final String TAG;
    private static final String TYPE_TO_REPLACE = "TYPE_TO_REPLACE";
    private static final Gson gson;

    static {
        Object object = new JsonUtils();
        INSTANCE = object;
        TAG = "JsonUtils";
        gson = object = new Gson();
    }

    private JsonUtils() {
    }

    public static final String createErrorMessage(String string2, String string3) {
        string2 = TextUtils.htmlEncode((String)string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string4 = "";
        if (bl2) {
            string2 = string4;
        }
        Intrinsics.checkNotNull(string2);
        String string5 = ERROR_MESSAGE_JSON;
        String string6 = MSG_TO_REPLACE;
        string2 = b.n(string5, string6, string2, false);
        bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2 || string3 == null) {
            string3 = string4;
        }
        return b.n(string2, TYPE_TO_REPLACE, string3, false);
    }

    public static final Object fromJson(String object, Class object2) {
        Gson gson = JsonUtils.gson;
        try {
            object = gson.fromJson((String)object, (Class)object2);
        }
        catch (Exception exception) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(exception);
            object = null;
        }
        return object;
    }

    public static final List fromJsonArray(String object, Class type2) {
        Object object2 = new JsonParser();
        object = ((JsonParser)object2).parse((String)object).getAsJsonArray();
        if ((type2 = JsonUtils.getAssociatedTypeFromClass(type2)) != null) {
            object2 = gson;
            object = ((Gson)object2).fromJson((JsonElement)object, type2);
            Intrinsics.checkNotNull(object);
            object = (List)object;
        } else {
            object = new ArrayList();
        }
        return object;
    }

    public static final Type getAssociatedTypeFromClass(Class object) {
        if (object != null) {
            Class clazz = Error.class;
            boolean bl2 = Intrinsics.areEqual(object, clazz);
            if (bl2) {
                object = new JsonUtils$getAssociatedTypeFromClass$1();
                object = ((TypeToken)object).getType();
            } else {
                clazz = UserInformationModel.class;
                bl2 = Intrinsics.areEqual(object, clazz);
                if (bl2) {
                    object = new JsonUtils$getAssociatedTypeFromClass$2();
                    object = ((TypeToken)object).getType();
                } else {
                    clazz = CartModification.class;
                    boolean bl3 = Intrinsics.areEqual(object, clazz);
                    if (bl3) {
                        object = new JsonUtils$getAssociatedTypeFromClass$3();
                        object = ((TypeToken)object).getType();
                    } else {
                        bl3 = false;
                        object = null;
                    }
                }
            }
            return object;
        }
        String string2 = "Required value was null.".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static final String toJson(Object object) {
        object = gson.toJson(object);
        Intrinsics.checkNotNullExpressionValue(object, "toJson(...)");
        return object;
    }

    public final Gson getGson() {
        return gson;
    }
}

