/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.login.widget;

import com.facebook.Profile;
import com.facebook.login.widget.ProfilePictureView;

public final class ProfilePictureView$b
extends jb2_0 {
    public final /* synthetic */ ProfilePictureView d;

    public ProfilePictureView$b(ProfilePictureView profilePictureView) {
        this.d = profilePictureView;
    }

    public final void a(Profile object) {
        object = object != null ? ((Profile)object).a : null;
        ProfilePictureView profilePictureView = this.d;
        profilePictureView.setProfileId((String)object);
        profilePictureView.f(true);
    }
}

