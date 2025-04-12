/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.components.ComponentRuntime$1;
import com.google.firebase.components.ComponentRuntime$Builder;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.EventBus;
import com.google.firebase.components.LazySet;
import com.google.firebase.components.MissingDependencyException;
import com.google.firebase.components.OptionalProvider;
import com.google.firebase.components.Preconditions;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.RestrictedComponentContainer;
import com.google.firebase.components.a;
import com.google.firebase.components.b;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class ComponentRuntime
implements ComponentContainer,
ComponentLoader {
    private static final Provider EMPTY_PROVIDER;
    private final ComponentRegistrarProcessor componentRegistrarProcessor;
    private final Map components;
    private final AtomicReference eagerComponentsInitializedWith;
    private final EventBus eventBus;
    private final Map lazyInstanceMap;
    private final Map lazySetMap;
    private Set processedCoroutineDispatcherInterfaces;
    private final List unprocessedRegistrarProviders;

    static {
        p10 p102 = new Object();
        EMPTY_PROVIDER = p102;
    }

    private ComponentRuntime(Executor arrayList, Iterable iterable, Collection object, ComponentRegistrarProcessor object2) {
        Class<ComponentLoader> clazz = new Class<ComponentLoader>();
        this.components = clazz;
        clazz = new Class<ComponentLoader>();
        this.lazyInstanceMap = clazz;
        clazz = new Class<ComponentLoader>();
        this.lazySetMap = clazz;
        this.processedCoroutineDispatcherInterfaces = clazz;
        super();
        this.eagerComponentsInitializedWith = clazz;
        clazz = new Class<ComponentLoader>((Executor)((Object)arrayList));
        this.eventBus = clazz;
        this.componentRegistrarProcessor = object2;
        arrayList = new ArrayList<Class[]>();
        int n3 = 2;
        object2 = new Class[n3];
        object2[0] = Subscriber.class;
        int n4 = 1;
        object2[n4] = Publisher.class;
        Class<EventBus> clazz2 = EventBus.class;
        object2 = Component.of((Object)clazz, clazz2, object2);
        arrayList.add((Class[])object2);
        object2 = new Class[]{};
        clazz = ComponentLoader.class;
        object2 = Component.of((Object)this, clazz, object2);
        arrayList.add((Class[])object2);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Component)object.next();
            if (object2 == null) continue;
            arrayList.add((Class[])object2);
        }
        iterable = ComponentRuntime.iterableToList(iterable);
        this.unprocessedRegistrarProviders = iterable;
        this.discoverComponents(arrayList);
    }

    public /* synthetic */ ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor, ComponentRuntime$1 componentRuntime$1) {
        this(executor, iterable, collection, componentRegistrarProcessor);
    }

    public ComponentRuntime(Executor executor, Iterable iterable, Component ... object) {
        iterable = ComponentRuntime.toProviders(iterable);
        object = Arrays.asList(object);
        ComponentRegistrarProcessor componentRegistrarProcessor = ComponentRegistrarProcessor.NOOP;
        this(executor, iterable, (Collection)object, componentRegistrarProcessor);
    }

    public static /* synthetic */ Object a(ComponentRuntime componentRuntime, Component component) {
        return componentRuntime.lambda$discoverComponents$0(component);
    }

    public static /* synthetic */ void b(OptionalProvider optionalProvider, Provider provider) {
        optionalProvider.set(provider);
    }

    public static ComponentRuntime$Builder builder(Executor executor) {
        ComponentRuntime$Builder componentRuntime$Builder = new ComponentRuntime$Builder(executor);
        return componentRuntime$Builder;
    }

    public static /* synthetic */ ComponentRegistrar c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    public static /* synthetic */ void d(LazySet lazySet, Provider provider) {
        lazySet.add(provider);
    }

    /*
     * Exception decompiling
     */
    private void discoverComponents(List var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [17 : 111->126)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void doInitializeEagerComponents(Map object, boolean bl2) {
        boolean bl3;
        object = object.entrySet().iterator();
        while (bl3 = object.hasNext()) {
            boolean bl4;
            Object object2 = (Map.Entry)object.next();
            Component component = (Component)object2.getKey();
            object2 = (Provider)object2.getValue();
            boolean bl5 = component.isAlwaysEager();
            if (!bl5 && (!(bl4 = component.isEagerInDefaultApp()) || !bl2)) continue;
            object2.get();
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    private static List iterableToList(Iterable object) {
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object e2 = object.next();
            arrayList.add(e2);
        }
        return arrayList;
    }

    private /* synthetic */ Object lambda$discoverComponents$0(Component component) {
        ComponentFactory componentFactory = component.getFactory();
        RestrictedComponentContainer restrictedComponentContainer = new RestrictedComponentContainer(component, this);
        return componentFactory.create(restrictedComponentContainer);
    }

    private void maybeInitializeEagerComponents() {
        Boolean bl2 = (Boolean)this.eagerComponentsInitializedWith.get();
        if (bl2 != null) {
            Map map2 = this.components;
            boolean bl3 = bl2;
            this.doInitializeEagerComponents(map2, bl3);
        }
    }

    private void processDependencies() {
        boolean bl2;
        Object object = this.components.keySet().iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2 = (Component)object.next();
            Object object3 = ((Component)object2).getDependencies().iterator();
            while (bl3 = object3.hasNext()) {
                Object object4;
                Map map2;
                Object object5 = (Dependency)object3.next();
                boolean bl4 = ((Dependency)object5).isSet();
                if (bl4 && !(bl4 = (map2 = this.lazySetMap).containsKey(object4 = ((Dependency)object5).getInterface()))) {
                    map2 = this.lazySetMap;
                    object5 = ((Dependency)object5).getInterface();
                    object4 = LazySet.fromCollection(Collections.emptySet());
                    map2.put(object5, object4);
                    continue;
                }
                map2 = this.lazyInstanceMap;
                object4 = ((Dependency)object5).getInterface();
                bl4 = map2.containsKey(object4);
                if (bl4) continue;
                bl4 = ((Dependency)object5).isRequired();
                if (!bl4) {
                    bl4 = ((Dependency)object5).isSet();
                    if (bl4) continue;
                    map2 = this.lazyInstanceMap;
                    object5 = ((Dependency)object5).getInterface();
                    object4 = OptionalProvider.empty();
                    map2.put(object5, object4);
                    continue;
                }
                object3 = ((Dependency)object5).getInterface();
                object5 = new StringBuilder("Unsatisfied dependency for component ");
                ((StringBuilder)object5).append(object2);
                ((StringBuilder)object5).append(": ");
                ((StringBuilder)object5).append(object3);
                object2 = ((StringBuilder)object5).toString();
                object = new MissingDependencyException((String)object2);
                throw object;
            }
        }
    }

    private List processInstanceComponents(List object) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            boolean bl3;
            Object object2 = (Component)object.next();
            boolean bl4 = ((Component)object2).isValue();
            if (!bl4) continue;
            Provider provider = (Provider)this.components.get(object2);
            object2 = ((Component)object2).getProvidedInterfaces().iterator();
            while (bl3 = object2.hasNext()) {
                Object object3 = this.lazyInstanceMap;
                Object object4 = (Qualified)object2.next();
                boolean bl5 = object3.containsKey(object4);
                if (!bl5) {
                    object3 = this.lazyInstanceMap;
                    object3.put(object4, provider);
                    continue;
                }
                object4 = (OptionalProvider)((Provider)this.lazyInstanceMap.get(object4));
                object3 = new a((OptionalProvider)object4, provider);
                arrayList.add(object3);
            }
        }
        return arrayList;
    }

    private List processSetComponents() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        boolean bl3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object4 = new HashMap();
        Object object5 = this.components.entrySet().iterator();
        while (bl3 = object5.hasNext()) {
            object3 = object5.next();
            object2 = (Component)object3.getKey();
            boolean bl4 = ((Component)object2).isValue();
            if (bl4) continue;
            object3 = (Provider)object3.getValue();
            object2 = ((Component)object2).getProvidedInterfaces().iterator();
            while (bl4 = object2.hasNext()) {
                object = (Qualified)object2.next();
                boolean bl5 = ((HashMap)object4).containsKey(object);
                if (!bl5) {
                    HashSet hashSet = new HashSet();
                    ((HashMap)object4).put(object, hashSet);
                }
                object = (Set)((HashMap)object4).get(object);
                object.add(object3);
            }
        }
        object4 = ((HashMap)object4).entrySet().iterator();
        while (bl2 = object4.hasNext()) {
            boolean bl6;
            object3 = this.lazySetMap;
            object5 = (Map.Entry)object4.next();
            object2 = object5.getKey();
            bl3 = object3.containsKey(object2);
            if (!bl3) {
                object3 = this.lazySetMap;
                object2 = (Qualified)object5.getKey();
                object5 = LazySet.fromCollection((Collection)object5.getValue());
                object3.put(object2, object5);
                continue;
            }
            object3 = this.lazySetMap;
            object2 = object5.getKey();
            object3 = (LazySet)object3.get(object2);
            object5 = ((Set)object5.getValue()).iterator();
            while (bl6 = object5.hasNext()) {
                object2 = (Provider)object5.next();
                object = new b((LazySet)object3, (Provider)object2);
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    private static Iterable toProviders(Iterable object) {
        boolean bl2;
        ArrayList<o10> arrayList = new ArrayList<o10>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            ComponentRegistrar componentRegistrar = (ComponentRegistrar)object.next();
            o10 o102 = new o10(componentRegistrar);
            arrayList.add(o102);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void discoverComponents() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.unprocessedRegistrarProviders;
                boolean bl2 = arrayList.isEmpty();
                if (bl2) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl8 : MonitorExitStatement: MONITOREXIT : this
                arrayList = new ArrayList();
                this.discoverComponents(arrayList);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final /* synthetic */ Object get(Qualified qualified) {
        return g10.a(this, qualified);
    }

    public final /* synthetic */ Object get(Class clazz) {
        return g10.b(this, clazz);
    }

    public Collection getAllComponentsForTest() {
        return this.components.keySet();
    }

    public Deferred getDeferred(Qualified object) {
        if ((object = this.getProvider((Qualified)object)) == null) {
            return OptionalProvider.empty();
        }
        boolean bl2 = object instanceof OptionalProvider;
        if (bl2) {
            return (OptionalProvider)object;
        }
        return OptionalProvider.of((Provider)object);
    }

    public final /* synthetic */ Deferred getDeferred(Class clazz) {
        return g10.c(this, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Provider getProvider(Qualified object) {
        synchronized (this) {
            Object object2 = "Null interface requested.";
            Preconditions.checkNotNull(object, (String)object2);
            object2 = this.lazyInstanceMap;
            object = object2.get(object);
            return (Provider)object;
        }
    }

    public final /* synthetic */ Provider getProvider(Class clazz) {
        return g10.d(this, clazz);
    }

    public void initializeAllComponentsForTests() {
        boolean bl2;
        Iterator iterator = this.components.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Provider provider = (Provider)iterator.next();
            provider.get();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void initializeEagerComponents(boolean bl2) {
        Object var4_4;
        Serializable serializable = this.eagerComponentsInitializedWith;
        Object object = bl2;
        do {
            var4_4 = null;
            boolean bl3 = serializable.compareAndSet(null, object);
            if (!bl3) continue;
            synchronized (this) {
                object = this.components;
                serializable = new HashMap(object);
            }
            this.doInitializeEagerComponents((Map)((Object)serializable), bl2);
            return;
        } while ((var4_4 = serializable.get()) == null);
    }

    public final /* synthetic */ Set setOf(Qualified qualified) {
        return g10.e(this, qualified);
    }

    public final /* synthetic */ Set setOf(Class clazz) {
        return g10.f(this, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Provider setOfProvider(Qualified object) {
        synchronized (this) {
            Map map2 = this.lazySetMap;
            object = map2.get(object);
            object = (LazySet)object;
            if (object == null) return EMPTY_PROVIDER;
            return object;
        }
    }

    public final /* synthetic */ Provider setOfProvider(Class clazz) {
        return g10.g(this, clazz);
    }
}

