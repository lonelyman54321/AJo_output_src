/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.google.android.gms.plus;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.internal.plus.zzr;
import com.google.android.gms.plus.model.people.Person;

public final class PlusShare {
    public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
    public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
    public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
    public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
    public static final String KEY_CALL_TO_ACTION_LABEL = "label";
    public static final String KEY_CALL_TO_ACTION_URL = "url";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
    public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";

    public PlusShare() {
        AssertionError assertionError = new AssertionError();
        throw assertionError;
    }

    public static Person createPerson(String object, String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                zzr zzr2 = new zzr(string2, (String)object, null, 0, null);
                return zzr2;
            }
            object = new IllegalArgumentException("Display name must not be empty.");
            throw object;
        }
        object = new IllegalArgumentException("MinimalPerson ID must not be empty.");
        throw object;
    }

    public static String getDeepLinkId(Intent object) {
        Object object2;
        if (object != null && (object2 = object.getData()) != null) {
            object = object.getData();
            object2 = PARAM_CONTENT_DEEP_LINK_ID;
            object = object.getQueryParameter((String)object2);
        } else {
            object = null;
        }
        return object;
    }

    public static boolean zza(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return false;
        }
        String string3 = " ";
        boolean bl3 = string2.contains(string3);
        return !bl3;
    }
}

