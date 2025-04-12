/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
package com.affise.attribution.modules;

import android.app.Application;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.modules.AffiseKeyValue;
import com.affise.attribution.modules.AffiseModule;
import com.affise.attribution.modules.AffiseModuleApi;
import com.affise.attribution.modules.AffiseModuleManager$init$1;
import com.affise.attribution.modules.AffiseModules;
import com.affise.attribution.modules.OnKeyValueCallback;
import com.affise.attribution.modules.exceptions.AffiseModuleError$Version;
import com.affise.attribution.parameters.factory.PostBackModelFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseModuleManager {
    private final Application application;
    private final LogsManager logsManager;
    private Map modules;
    private final PostBackModelFactory postBackModelFactory;

    public AffiseModuleManager(Application object, LogsManager logsManager2, PostBackModelFactory postBackModelFactory2) {
        Intrinsics.checkNotNullParameter(object, "application");
        Intrinsics.checkNotNullParameter(logsManager2, "logsManager");
        Intrinsics.checkNotNullParameter(postBackModelFactory2, "postBackModelFactory");
        this.application = object;
        this.logsManager = logsManager2;
        this.postBackModelFactory = postBackModelFactory2;
        this.modules = object;
    }

    public static final /* synthetic */ Application access$getApplication$p(AffiseModuleManager affiseModuleManager) {
        return affiseModuleManager.application;
    }

    public static final /* synthetic */ LogsManager access$getLogsManager$p(AffiseModuleManager affiseModuleManager) {
        return affiseModuleManager.logsManager;
    }

    public static final /* synthetic */ PostBackModelFactory access$getPostBackModelFactory$p(AffiseModuleManager affiseModuleManager) {
        return affiseModuleManager.postBackModelFactory;
    }

    public static final /* synthetic */ void access$moduleStart(AffiseModuleManager affiseModuleManager, AffiseModule affiseModule) {
        affiseModuleManager.moduleStart(affiseModule);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final AffiseModule getClassInstance(String object) {
        Object object2 = null;
        try {
            object = Class.forName((String)object);
        }
        catch (Exception exception) {
            return object2;
        }
        object = ((Class)object).getDeclaredConstructor(null);
        object = ((Constructor)object).newInstance(null);
        boolean bl2 = object instanceof AffiseModule;
        if (!bl2) return object2;
        return object = (AffiseModule)object;
    }

    private final void initAffiseModules(Function1 function1) {
        for (AffiseModules affiseModules : AffiseModules.values()) {
            String string2;
            Object object = affiseModules.getModule();
            if ((object = this.getClassInstance((String)object)) == null) continue;
            Object object2 = ((AffiseModule)object).getVersion();
            boolean bl2 = Intrinsics.areEqual(object2, string2 = "1.6.52");
            if (bl2) {
                object2 = this.modules;
                object2.put(affiseModules, object);
                function1.invoke(object);
                continue;
            }
            object2 = new AffiseModuleError$Version(affiseModules, (AffiseModule)object);
        }
    }

    private final void moduleStart(AffiseModule object) {
        ((AffiseModule)object).start();
        PostBackModelFactory postBackModelFactory2 = this.postBackModelFactory;
        object = ((AffiseModule)object).providers();
        postBackModelFactory2.addProviders((List)object);
    }

    public final AffiseModuleApi api(AffiseModules object) {
        String string2 = "module";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.getModule((AffiseModules)((Object)object));
        boolean bl2 = object instanceof AffiseModuleApi;
        object = bl2 ? (AffiseModuleApi)object : null;
        return object;
    }

    public final AffiseModule getModule(AffiseModules affiseModules) {
        Intrinsics.checkNotNullParameter((Object)affiseModules, "module");
        return (AffiseModule)this.modules.get((Object)affiseModules);
    }

    public final List getModules() {
        Object object = this.modules;
        int n3 = object.size();
        ArrayList<AffiseModules> arrayList = new ArrayList<AffiseModules>(n3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            AffiseModules affiseModules = (AffiseModules)((Object)((Map.Entry)object.next()).getKey());
            arrayList.add(affiseModules);
        }
        return arrayList;
    }

    public final void init(List list) {
        Intrinsics.checkNotNullParameter(list, "dependencies");
        AffiseModuleManager$init$1 affiseModuleManager$init$1 = new AffiseModuleManager$init$1(this, list);
        this.initAffiseModules(affiseModuleManager$init$1);
    }

    public final boolean manualStart(AffiseModules object) {
        Intrinsics.checkNotNullParameter(object, "module");
        object = this.getModule((AffiseModules)((Object)object));
        if (object != null) {
            boolean bl2 = ((AffiseModule)object).isManual();
            if (!bl2) {
                return false;
            }
            this.moduleStart((AffiseModule)object);
            return true;
        }
        return false;
    }

    public final void status(AffiseModules object, OnKeyValueCallback onKeyValueCallback) {
        Intrinsics.checkNotNullParameter(object, "module");
        Intrinsics.checkNotNullParameter(onKeyValueCallback, "onComplete");
        Object object2 = this.getModule((AffiseModules)((Object)object));
        if (object2 != null) {
            ((AffiseModule)object2).status(onKeyValueCallback);
            object2 = Unit.a;
        } else {
            object2 = null;
        }
        if (object2 == null) {
            object = object.name();
            String string2 = "not found";
            object2 = new AffiseKeyValue((String)object, string2);
            object = a.b(object2);
            onKeyValueCallback.handle((List)object);
        }
    }
}

