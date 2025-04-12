/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;

public final class FragmentManager$i
implements w3 {
    public final /* synthetic */ FragmentManager a;

    public FragmentManager$i(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Object object) {
        String string2;
        object = (ActivityResult)object;
        Object object2 = this.a;
        FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo)((FragmentManager)object2).G.pollFirst();
        if (fragmentManager$LaunchedFragmentInfo != null && (object2 = ((FragmentManager)object2).c.c(string2 = fragmentManager$LaunchedFragmentInfo.a)) != null) {
            int n3 = ((ActivityResult)object).a;
            int n4 = fragmentManager$LaunchedFragmentInfo.b;
            object = ((ActivityResult)object).b;
            ((Fragment)object2).onActivityResult(n4, n3, (Intent)object);
        }
    }
}

