/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.List;

public class PlusShare$Builder {
    private final Context mContext;
    private final Intent mIntent;
    private boolean zzp;
    private ArrayList zzq;

    public PlusShare$Builder(Activity activity) {
        this.mContext = activity;
        Intent intent = new Intent();
        String string2 = "android.intent.action.SEND";
        this.mIntent = intent = intent.setAction(string2);
        int n3 = 524288;
        intent.addFlags(n3);
        if (activity != null && (activity = activity.getComponentName()) != null) {
            boolean bl2;
            this.zzp = bl2 = true;
        }
    }

    public PlusShare$Builder(Context context) {
        this.mContext = context;
        context = context.setAction("android.intent.action.SEND");
        this.mIntent = context;
    }

    public PlusShare$Builder addCallToAction(String string2, Uri object, String string3) {
        boolean bl2;
        boolean bl3 = this.zzp;
        String string4 = "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action";
        Preconditions.checkState(bl3, string4);
        bl3 = true;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(string4 = object.toString())))) {
            bl2 = true;
        } else {
            bl2 = false;
            string4 = null;
        }
        String string5 = "Must provide a call to action URL";
        Preconditions.checkArgument(bl2, string5);
        string4 = new Bundle();
        boolean bl4 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl4) {
            string5 = "label";
            string4.putString(string5, string2);
        }
        string2 = "url";
        object = object.toString();
        string4.putString(string2, (String)object);
        boolean bl5 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl5) {
            bl5 = PlusShare.zza(string3);
            object = "The specified deep-link ID was malformed.";
            Preconditions.checkState(bl5, object);
            string2 = "deepLinkId";
            string4.putString(string2, string3);
        }
        this.mIntent.putExtra("com.google.android.apps.plus.CALL_TO_ACTION", (Bundle)string4);
        this.mIntent.putExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", bl3);
        this.mIntent.setType("text/plain");
        return this;
    }

    public PlusShare$Builder addStream(Uri uri) {
        Intent intent = this.mIntent;
        Object object = "android.intent.extra.STREAM";
        if ((intent = (Uri)intent.getParcelableExtra((String)object)) == null) {
            return this.setStream(uri);
        }
        object = this.zzq;
        if (object == null) {
            this.zzq = object = new Object();
        }
        this.zzq.add(intent);
        this.zzq.add(uri);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Intent getIntent() {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object = this.zzq;
        boolean bl5 = true;
        Object object2 = null;
        if (object != null && (bl4 = ((ArrayList)object).size()) > bl5) {
            bl4 = true;
        } else {
            bl4 = false;
            object = null;
        }
        String string2 = this.mIntent.getAction();
        String string3 = "android.intent.action.SEND_MULTIPLE";
        boolean bl6 = string3.equals(string2);
        Object object3 = this.mIntent;
        Object object4 = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
        boolean bl7 = object3.getBooleanExtra((String)object4, false);
        if (bl4 && bl7) {
            bl3 = false;
            object4 = null;
        } else {
            bl3 = true;
        }
        String string4 = "Call-to-action buttons are only available for URLs.";
        Preconditions.checkState(bl3, string4);
        object4 = "com.google.android.apps.plus.CONTENT_URL";
        if (bl7 && !(bl2 = (string4 = this.mIntent).hasExtra((String)object4))) {
            bl2 = false;
            string4 = null;
        } else {
            bl2 = true;
        }
        String string5 = "The content URL is required for interactive posts.";
        Preconditions.checkState(bl2, string5);
        string4 = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
        if (bl7 && !(bl7 = (object3 = this.mIntent).hasExtra((String)object4)) && !(bl7 = (object3 = this.mIntent).hasExtra(string4))) {
            bl5 = false;
            Object var15_15 = null;
        }
        object3 = "Must set content URL or content deep-link ID to use a call-to-action button.";
        Preconditions.checkState(bl5, object3);
        Intent intent = this.mIntent;
        bl5 = intent.hasExtra(string4);
        if (bl5) {
            String string6 = this.mIntent.getStringExtra(string4);
            bl5 = PlusShare.zza(string6);
            object3 = "The specified deep-link ID was malformed.";
            Preconditions.checkState(bl5, object3);
        }
        String string7 = "android.intent.extra.STREAM";
        if (!bl4 && bl6) {
            object3 = this.mIntent;
            object4 = "android.intent.action.SEND";
            object3.setAction((String)object4);
            object3 = this.zzq;
            if (object3 != null && !(bl7 = ((ArrayList)object3).isEmpty())) {
                object3 = this.mIntent;
                object4 = this.zzq;
                object2 = (Parcelable)((ArrayList)object4).get(0);
                object3.putExtra(string7, (Parcelable)object2);
            } else {
                object2 = this.mIntent;
                object2.removeExtra(string7);
            }
            object2 = null;
            this.zzq = null;
        }
        if (bl4 && !bl6) {
            this.mIntent.setAction(string3);
            object = this.zzq;
            if (object != null && !(bl4 = ((ArrayList)object).isEmpty())) {
                object = this.mIntent;
                object2 = this.zzq;
                object.putParcelableArrayListExtra(string7, (ArrayList)object2);
            } else {
                object = this.mIntent;
                object.removeExtra(string7);
            }
        }
        object = this.mIntent.getAction();
        bl4 = "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(object);
        object2 = "com.google.android.gms";
        if (!bl4) {
            object = this.mIntent;
            bl4 = object.hasExtra(string7);
            if (bl4) {
                object = this.mIntent;
                String string8 = "com.google.android.apps.plus";
                object.setPackage(string8);
                return this.mIntent;
            }
            object = this.mIntent;
            String string9 = "com.google.android.gms.plus.action.SHARE_GOOGLE";
            object.setAction(string9);
        }
        object = this.mIntent;
        object.setPackage((String)object2);
        return this.mIntent;
    }

    public PlusShare$Builder setContentDeepLinkId(String string2) {
        return this.setContentDeepLinkId(string2, null, null, null);
    }

    public PlusShare$Builder setContentDeepLinkId(String string2, String string3, String string4, Uri uri) {
        Preconditions.checkArgument(this.zzp, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2) ^ true;
        Preconditions.checkArgument(bl2, "The deepLinkId parameter is required.");
        Bundle bundle = new Bundle();
        String string5 = "title";
        bundle.putString(string5, string3);
        string3 = "description";
        bundle.putString(string3, string4);
        if (uri != null) {
            string3 = "thumbnailUrl";
            string4 = uri.toString();
            bundle.putString(string3, string4);
        }
        this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", string2);
        this.mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", bundle);
        this.mIntent.setType("text/plain");
        return this;
    }

    public PlusShare$Builder setContentUrl(Uri object) {
        object = object != null ? object.toString() : null;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        String string2 = "com.google.android.apps.plus.CONTENT_URL";
        if (bl2) {
            object = this.mIntent;
            object.removeExtra(string2);
        } else {
            Intent intent = this.mIntent;
            intent.putExtra(string2, (String)object);
        }
        return this;
    }

    public PlusShare$Builder setRecipients(Person object, List object2) {
        boolean bl2;
        int n3;
        Object object3 = this.mIntent;
        object = object != null ? object.getId() : "0";
        String string2 = "com.google.android.apps.plus.SENDER_ID";
        object3.putExtra(string2, (String)object);
        if (object2 != null) {
            n3 = object2.size();
        } else {
            n3 = 0;
            object = null;
        }
        object3 = "com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES";
        string2 = "com.google.android.apps.plus.RECIPIENT_IDS";
        if (n3 == 0) {
            this.mIntent.removeExtra(string2);
            this.mIntent.removeExtra((String)object3);
            return this;
        }
        ArrayList<String> arrayList = new ArrayList<String>(n3);
        ArrayList<Object> arrayList2 = new ArrayList<Object>(n3);
        object = object2.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Person)object.next();
            String string3 = object2.getId();
            arrayList.add(string3);
            object2 = object2.getDisplayName();
            arrayList2.add(object2);
        }
        this.mIntent.putStringArrayListExtra(string2, arrayList);
        this.mIntent.putStringArrayListExtra((String)object3, arrayList2);
        return this;
    }

    public PlusShare$Builder setStream(Uri uri) {
        this.zzq = null;
        this.mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)uri);
        return this;
    }

    public PlusShare$Builder setText(CharSequence charSequence) {
        this.mIntent.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    public PlusShare$Builder setType(String string2) {
        this.mIntent.setType(string2);
        return this;
    }
}

