/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Action$Builder;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.appindexing.Thing$Builder;
import com.google.android.gms.appindexing.zza;

public final class Action
extends Thing {
    public static final String STATUS_TYPE_ACTIVE = "http://schema.org/ActiveActionStatus";
    public static final String STATUS_TYPE_COMPLETED = "http://schema.org/CompletedActionStatus";
    public static final String STATUS_TYPE_FAILED = "http://schema.org/FailedActionStatus";
    public static final String TYPE_ACTIVATE = "http://schema.org/ActivateAction";
    public static final String TYPE_ADD = "http://schema.org/AddAction";
    public static final String TYPE_BOOKMARK = "http://schema.org/BookmarkAction";
    public static final String TYPE_COMMUNICATE = "http://schema.org/CommunicateAction";
    public static final String TYPE_FILM = "http://schema.org/FilmAction";
    public static final String TYPE_LIKE = "http://schema.org/LikeAction";
    public static final String TYPE_LISTEN = "http://schema.org/ListenAction";
    public static final String TYPE_PHOTOGRAPH = "http://schema.org/PhotographAction";
    public static final String TYPE_RESERVE = "http://schema.org/ReserveAction";
    public static final String TYPE_SEARCH = "http://schema.org/SearchAction";
    public static final String TYPE_VIEW = "http://schema.org/ViewAction";
    public static final String TYPE_WANT = "http://schema.org/WantAction";
    public static final String TYPE_WATCH = "http://schema.org/WatchAction";

    public /* synthetic */ Action(Bundle bundle, zza zza2) {
        super(bundle);
    }

    public static Action newAction(String string2, String string3, Uri uri) {
        return Action.newAction(string2, string3, null, uri);
    }

    public static Action newAction(String object, String string2, Uri uri, Uri uri2) {
        Action$Builder action$Builder = new Action$Builder((String)object);
        object = new Thing$Builder();
        ((Thing$Builder)object).setName(string2);
        string2 = uri == null ? null : uri.toString();
        ((Thing$Builder)object).setId(string2);
        ((Thing$Builder)object).setUrl(uri2);
        object = ((Thing$Builder)object).build();
        action$Builder.setObject((Thing)object);
        return action$Builder.build();
    }
}

