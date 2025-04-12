/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PostDetailsModel {
    private Component postData;

    public PostDetailsModel() {
        this(null, 1, null);
    }

    public PostDetailsModel(Component component) {
        this.postData = component;
    }

    public /* synthetic */ PostDetailsModel(Component component, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            component = null;
        }
        this(component);
    }

    public static /* synthetic */ PostDetailsModel copy$default(PostDetailsModel postDetailsModel, Component component, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            component = postDetailsModel.postData;
        }
        return postDetailsModel.copy(component);
    }

    public final Component component1() {
        return this.postData;
    }

    public final PostDetailsModel copy(Component component) {
        PostDetailsModel postDetailsModel = new PostDetailsModel(component);
        return postDetailsModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PostDetailsModel;
        if (!bl3) {
            return false;
        }
        object = (PostDetailsModel)object;
        Component component = this.postData;
        object = ((PostDetailsModel)object).postData;
        boolean bl4 = Intrinsics.areEqual(component, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Component getPostData() {
        return this.postData;
    }

    public int hashCode() {
        int n3;
        Component component = this.postData;
        if (component == null) {
            n3 = 0;
            component = null;
        } else {
            n3 = component.hashCode();
        }
        return n3;
    }

    public final void setPostData(Component component) {
        this.postData = component;
    }

    public String toString() {
        Component component = this.postData;
        StringBuilder stringBuilder = new StringBuilder("PostDetailsModel(postData=");
        stringBuilder.append(component);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

