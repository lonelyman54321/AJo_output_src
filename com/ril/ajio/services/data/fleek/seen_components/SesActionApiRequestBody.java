/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SesActionApiRequestBody {
    private ArrayList follow;
    private ArrayList like;
    private ArrayList unfollow;
    private ArrayList unlike;

    public SesActionApiRequestBody() {
        this(null, null, null, null, 15, null);
    }

    public SesActionApiRequestBody(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.like = arrayList;
        this.unlike = arrayList2;
        this.follow = arrayList3;
        this.unfollow = arrayList4;
    }

    public /* synthetic */ SesActionApiRequestBody(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = null;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            arrayList3 = null;
        }
        if ((n3 &= 8) != 0) {
            arrayList4 = null;
        }
        this(arrayList, arrayList2, arrayList3, arrayList4);
    }

    public static /* synthetic */ SesActionApiRequestBody copy$default(SesActionApiRequestBody sesActionApiRequestBody, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = sesActionApiRequestBody.like;
        }
        if ((n4 = n3 & 2) != 0) {
            arrayList2 = sesActionApiRequestBody.unlike;
        }
        if ((n4 = n3 & 4) != 0) {
            arrayList3 = sesActionApiRequestBody.follow;
        }
        if ((n3 &= 8) != 0) {
            arrayList4 = sesActionApiRequestBody.unfollow;
        }
        return sesActionApiRequestBody.copy(arrayList, arrayList2, arrayList3, arrayList4);
    }

    public final ArrayList component1() {
        return this.like;
    }

    public final ArrayList component2() {
        return this.unlike;
    }

    public final ArrayList component3() {
        return this.follow;
    }

    public final ArrayList component4() {
        return this.unfollow;
    }

    public final SesActionApiRequestBody copy(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        SesActionApiRequestBody sesActionApiRequestBody = new SesActionApiRequestBody(arrayList, arrayList2, arrayList3, arrayList4);
        return sesActionApiRequestBody;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SesActionApiRequestBody;
        if (!bl3) {
            return false;
        }
        object = (SesActionApiRequestBody)object;
        ArrayList arrayList = this.like;
        ArrayList arrayList2 = ((SesActionApiRequestBody)object).like;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.unlike;
        arrayList2 = ((SesActionApiRequestBody)object).unlike;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.follow;
        arrayList2 = ((SesActionApiRequestBody)object).follow;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.unfollow;
        object = ((SesActionApiRequestBody)object).unfollow;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getFollow() {
        return this.follow;
    }

    public final ArrayList getLike() {
        return this.like;
    }

    public final ArrayList getUnfollow() {
        return this.unfollow;
    }

    public final ArrayList getUnlike() {
        return this.unlike;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.like;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        ArrayList arrayList2 = this.unlike;
        if (arrayList2 == null) {
            n3 = 0;
            arrayList2 = null;
        } else {
            n3 = arrayList2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        arrayList2 = this.follow;
        if (arrayList2 == null) {
            n3 = 0;
            arrayList2 = null;
        } else {
            n3 = arrayList2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        arrayList2 = this.unfollow;
        if (arrayList2 != null) {
            n7 = arrayList2.hashCode();
        }
        return n4 + n7;
    }

    public final void setFollow(ArrayList arrayList) {
        this.follow = arrayList;
    }

    public final void setLike(ArrayList arrayList) {
        this.like = arrayList;
    }

    public final void setUnfollow(ArrayList arrayList) {
        this.unfollow = arrayList;
    }

    public final void setUnlike(ArrayList arrayList) {
        this.unlike = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.like;
        ArrayList arrayList2 = this.unlike;
        ArrayList arrayList3 = this.follow;
        ArrayList arrayList4 = this.unfollow;
        StringBuilder stringBuilder = new StringBuilder("SesActionApiRequestBody(like=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", unlike=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(", follow=");
        stringBuilder.append(arrayList3);
        stringBuilder.append(", unfollow=");
        stringBuilder.append(arrayList4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

