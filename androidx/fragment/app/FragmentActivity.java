/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.MenuItem
 *  android.view.View
 */
package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.b$d;
import androidx.core.app.b$e;
import androidx.core.app.b$f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity$a;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.fragment.app.l;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class FragmentActivity
extends ComponentActivity
implements b$d,
b$e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final o mFragmentLifecycleRegistry;
    final jW0 mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        jW0 jW02;
        Object object = new FragmentActivity$a(this);
        this.mFragments = jW02 = new jW0((FragmentActivity$a)object);
        this.mFragmentLifecycleRegistry = object = new o(this);
        this.mStopped = true;
        this.init();
    }

    public FragmentActivity(int n3) {
        super(n3);
        jW0 jW02;
        Object object = new FragmentActivity$a(this);
        this.mFragments = jW02 = new jW0((FragmentActivity$a)object);
        this.mFragmentLifecycleRegistry = object = new o(this);
        this.mStopped = true;
        this.init();
    }

    private void init() {
        Object object = this.getSavedStateRegistry();
        uv0_1 uv0_12 = new uv0_1(this);
        ((xs2_1)object).c(LIFECYCLE_TAG, uv0_12);
        object = new vv0_1(this);
        this.addOnConfigurationChangedListener((p60_0)object);
        object = new wv0_1(this);
        this.addOnNewIntentListener((p60_0)object);
        object = new xv0_0(this);
        this.addOnContextAvailableListener((u82_0)object);
    }

    public static /* synthetic */ void l2(FragmentActivity fragmentActivity, Context context) {
        fragmentActivity.lambda$init$3(context);
    }

    private /* synthetic */ Bundle lambda$init$0() {
        this.markFragmentsCreated();
        o o3 = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_STOP;
        o3.f(i$a);
        o3 = new Bundle();
        return o3;
    }

    private /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    private /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    private void lambda$init$3(Context object) {
        object = this.mFragments.a;
        object.d.b((lw0_0)object, (cw0_0)object, null);
    }

    public static /* synthetic */ void m2(FragmentActivity fragmentActivity, Configuration configuration) {
        fragmentActivity.lambda$init$1(configuration);
    }

    private static boolean markState(FragmentManager object, i$b i$b) {
        boolean bl2;
        object = ((FragmentManager)object).c.f().iterator();
        boolean bl3 = false;
        o o3 = null;
        while (bl2 = object.hasNext()) {
            i$b i$b2;
            boolean bl4;
            Fragment fragment = (Fragment)object.next();
            if (fragment == null) continue;
            Object object2 = fragment.getHost();
            if (object2 != null) {
                object2 = fragment.getChildFragmentManager();
                bl4 = FragmentActivity.markState((FragmentManager)object2, i$b);
                bl3 |= bl4;
            }
            if ((object2 = fragment.mViewLifecycleOwner) != null) {
                ((l)object2).b();
                object2 = ((l)object2).e.d;
                i$b2 = i$b.STARTED;
                bl4 = ((i$b)((Object)object2)).isAtLeast(i$b2);
                if (bl4) {
                    o3 = fragment.mViewLifecycleOwner.e;
                    o3.h(i$b);
                    bl3 = true;
                }
            }
            if (!(bl4 = ((i$b)((Object)(object2 = fragment.mLifecycleRegistry.d))).isAtLeast(i$b2 = i$b.STARTED))) continue;
            o3 = fragment.mLifecycleRegistry;
            o3.h(i$b);
            bl3 = true;
        }
        return bl3;
    }

    public static /* synthetic */ Bundle n2(FragmentActivity fragmentActivity) {
        return fragmentActivity.lambda$init$0();
    }

    public static /* synthetic */ void o2(FragmentActivity fragmentActivity, Intent intent) {
        fragmentActivity.lambda$init$2(intent);
    }

    public final View dispatchFragmentsOnCreateView(View view, String string2, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.d.f.onCreateView(view, string2, context, attributeSet);
    }

    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.dump(string2, fileDescriptor, printWriter, stringArray);
        int n3 = this.shouldDumpInternalState(stringArray);
        if (n3 == 0) {
            return;
        }
        printWriter.print(string2);
        printWriter.print("Local FragmentActivity ");
        n3 = System.identityHashCode(this);
        CharSequence charSequence = Integer.toHexString(n3);
        printWriter.print((String)charSequence);
        printWriter.println(" State:");
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append("  ");
        charSequence = ((StringBuilder)charSequence).toString();
        printWriter.print((String)charSequence);
        printWriter.print("mCreated=");
        boolean bl2 = this.mCreated;
        printWriter.print(bl2);
        printWriter.print(" mResumed=");
        bl2 = this.mResumed;
        printWriter.print(bl2);
        printWriter.print(" mStopped=");
        bl2 = this.mStopped;
        printWriter.print(bl2);
        Object object = this.getApplication();
        if (object != null) {
            object = Uv1.a(this);
            ((vv1_1)object).b((String)charSequence, fileDescriptor, printWriter, stringArray);
        }
        this.mFragments.a.d.v(string2, fileDescriptor, printWriter, stringArray);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.d;
    }

    public Uv1 getSupportLoaderManager() {
        return Uv1.a(this);
    }

    public void markFragmentsCreated() {
        i$b i$b;
        FragmentManager fragmentManager;
        boolean bl2;
        while (bl2 = FragmentActivity.markState(fragmentManager = this.getSupportFragmentManager(), i$b = i$b.CREATED)) {
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(n3, n4, intent);
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_CREATE;
        ((o)object).f(i$a);
        object = this.mFragments.a.d;
        ((FragmentManager)object).I = false;
        ((FragmentManager)object).J = false;
        ((FragmentManager)object).P.f = false;
        ((FragmentManager)object).u(1);
    }

    public View onCreateView(View view, String string2, Context context, AttributeSet attributeSet) {
        View view2 = this.dispatchFragmentsOnCreateView(view, string2, context, attributeSet);
        if (view2 == null) {
            return super.onCreateView(view, string2, context, attributeSet);
        }
        return view2;
    }

    public View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        View view = this.dispatchFragmentsOnCreateView(null, string2, context, attributeSet);
        if (view == null) {
            return super.onCreateView(string2, context, attributeSet);
        }
        return view;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.d.l();
        o o3 = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_DESTROY;
        o3.f(i$a);
    }

    public boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        int n4 = super.onMenuItemSelected(n3, menuItem);
        if (n4 != 0) {
            return true;
        }
        n4 = 6;
        if (n3 == n4) {
            return this.mFragments.a.d.j(menuItem);
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.d.u(5);
        o o3 = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_PAUSE;
        o3.f(i$a);
    }

    public void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        this.mFragments.a();
        super.onRequestPermissionsResult(n3, stringArray, nArray);
    }

    public void onResume() {
        boolean bl2;
        this.mFragments.a();
        super.onResume();
        this.mResumed = bl2 = true;
        this.mFragments.a.d.z(bl2);
    }

    public void onResumeFragments() {
        Object object = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_RESUME;
        ((o)object).f(i$a);
        object = this.mFragments.a.d;
        ((FragmentManager)object).I = false;
        ((FragmentManager)object).J = false;
        ((FragmentManager)object).P.f = false;
        ((FragmentManager)object).u(7);
    }

    public void onStart() {
        Object object;
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        boolean bl2 = this.mCreated;
        boolean bl3 = true;
        if (!bl2) {
            this.mCreated = bl3;
            object = this.mFragments.a.d;
            ((FragmentManager)object).I = false;
            ((FragmentManager)object).J = false;
            g g3 = ((FragmentManager)object).P;
            g3.f = false;
            int n3 = 4;
            ((FragmentManager)object).u(n3);
        }
        this.mFragments.a.d.z(bl3);
        object = this.mFragmentLifecycleRegistry;
        i$a i$a = i$a.ON_START;
        ((o)object).f(i$a);
        object = this.mFragments.a.d;
        ((FragmentManager)object).I = false;
        ((FragmentManager)object).J = false;
        ((FragmentManager)object).P.f = false;
        ((FragmentManager)object).u(5);
    }

    public void onStateNotSaved() {
        this.mFragments.a();
    }

    public void onStop() {
        boolean bl2;
        super.onStop();
        this.mStopped = bl2 = true;
        this.markFragmentsCreated();
        Object object = this.mFragments.a.d;
        object.J = bl2;
        object.P.f = bl2;
        object.u(4);
        o o3 = this.mFragmentLifecycleRegistry;
        object = i$a.ON_STOP;
        o3.f((i$a)((Object)object));
    }

    public void setEnterSharedElementCallback(e23 e232) {
        b$f b$f = e232 != null ? new b$f(e232) : null;
        this.setEnterSharedElementCallback(b$f);
    }

    public void setExitSharedElementCallback(e23 e232) {
        b$f b$f = e232 != null ? new b$f(e232) : null;
        this.setExitSharedElementCallback(b$f);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int n3) {
        this.startActivityFromFragment(fragment, intent, n3, null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int n3, Bundle bundle) {
        int n4 = -1;
        if (n3 == n4) {
            this.startActivityForResult(intent, n4, bundle);
            return;
        }
        fragment.startActivityForResult(intent, n3, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        int n10 = -1;
        if (n3 == n10) {
            this.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
    }

    public void supportFinishAfterTransition() {
        this.finishAfterTransition();
    }

    public void supportInvalidateOptionsMenu() {
        this.invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        this.postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        this.startPostponedEnterTransition();
    }

    public final void validateRequestPermissionsRequestCode(int n3) {
    }
}

