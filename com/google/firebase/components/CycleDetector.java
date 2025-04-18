/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

import com.google.firebase.components.Component;
import com.google.firebase.components.CycleDetector$ComponentNode;
import com.google.firebase.components.CycleDetector$Dep;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.Qualified;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class CycleDetector {
    public static void detect(List arrayList) {
        boolean bl2;
        boolean bl3;
        Object object = CycleDetector.toGraph(arrayList);
        Object object2 = CycleDetector.getRoots((Set)object);
        int n3 = 0;
        while (!(bl3 = object2.isEmpty())) {
            boolean bl4;
            CycleDetector$ComponentNode cycleDetector$ComponentNode = (CycleDetector$ComponentNode)object2.iterator().next();
            object2.remove(cycleDetector$ComponentNode);
            ++n3;
            Iterator iterator = cycleDetector$ComponentNode.getDependencies().iterator();
            while (bl4 = iterator.hasNext()) {
                CycleDetector$ComponentNode cycleDetector$ComponentNode2 = (CycleDetector$ComponentNode)iterator.next();
                cycleDetector$ComponentNode2.removeDependent(cycleDetector$ComponentNode);
                boolean bl5 = cycleDetector$ComponentNode2.isRoot();
                if (!bl5) continue;
                object2.add(cycleDetector$ComponentNode2);
            }
        }
        int n4 = arrayList.size();
        if (n3 == n4) {
            return;
        }
        arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (CycleDetector$ComponentNode)object.next();
            n3 = (int)(((CycleDetector$ComponentNode)object2).isRoot() ? 1 : 0);
            if (n3 != 0 || (n3 = (int)(((CycleDetector$ComponentNode)object2).isLeaf() ? 1 : 0)) != 0) continue;
            object2 = ((CycleDetector$ComponentNode)object2).getComponent();
            arrayList.add(object2);
        }
        object = new DependencyCycleException(arrayList);
        throw object;
    }

    private static Set getRoots(Set object) {
        boolean bl2;
        HashSet<CycleDetector$ComponentNode> hashSet = new HashSet<CycleDetector$ComponentNode>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            CycleDetector$ComponentNode cycleDetector$ComponentNode = (CycleDetector$ComponentNode)object.next();
            boolean bl3 = cycleDetector$ComponentNode.isRoot();
            if (!bl3) continue;
            hashSet.add(cycleDetector$ComponentNode);
        }
        return hashSet;
    }

    private static Set toGraph(List serializable) {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        boolean bl3;
        Iterator iterator;
        CycleDetector$ComponentNode cycleDetector$ComponentNode;
        Object object4;
        int n3 = serializable.size();
        Object object5 = new HashMap(n3);
        serializable = serializable.iterator();
        while ((n3 = (int)(serializable.hasNext() ? 1 : 0)) != 0) {
            object4 = (Component)serializable.next();
            cycleDetector$ComponentNode = new CycleDetector$ComponentNode((Component)object4);
            iterator = ((Component)object4).getProvidedInterfaces().iterator();
            while (bl3 = iterator.hasNext()) {
                boolean bl4;
                object3 = (Qualified)iterator.next();
                boolean bl5 = ((Component)object4).isValue() ^ true;
                object2 = new CycleDetector$Dep((Qualified)object3, bl5, null);
                if (!(bl5 = ((HashMap)object5).containsKey(object2))) {
                    object = new HashSet();
                    ((HashMap)object5).put(object2, object);
                }
                if (!(bl4 = (object = (Set)((HashMap)object5).get(object2)).isEmpty()) && !(bl2 = CycleDetector$Dep.access$100((CycleDetector$Dep)object2))) {
                    object5 = new StringBuilder("Multiple components provide ");
                    ((StringBuilder)object5).append(object3);
                    ((StringBuilder)object5).append(".");
                    object5 = ((StringBuilder)object5).toString();
                    serializable = new Serializable((String)object5);
                    throw serializable;
                }
                object.add(cycleDetector$ComponentNode);
            }
        }
        serializable = ((HashMap)object5).values().iterator();
        while ((n3 = (int)(serializable.hasNext() ? 1 : 0)) != 0) {
            boolean bl6;
            object4 = ((Set)serializable.next()).iterator();
            while (bl6 = object4.hasNext()) {
                cycleDetector$ComponentNode = (CycleDetector$ComponentNode)object4.next();
                iterator = cycleDetector$ComponentNode.getComponent().getDependencies().iterator();
                while (bl3 = iterator.hasNext()) {
                    object3 = (Dependency)iterator.next();
                    bl2 = ((Dependency)object3).isDirectInjection();
                    if (!bl2 || (object3 = (Set)((HashMap)object5).get(object2 = new CycleDetector$Dep((Qualified)(object = ((Dependency)object3).getInterface()), bl3 = ((Dependency)object3).isSet(), null))) == null) continue;
                    object3 = object3.iterator();
                    while (bl2 = object3.hasNext()) {
                        object2 = (CycleDetector$ComponentNode)object3.next();
                        cycleDetector$ComponentNode.addDependency((CycleDetector$ComponentNode)object2);
                        ((CycleDetector$ComponentNode)object2).addDependent(cycleDetector$ComponentNode);
                    }
                }
            }
        }
        serializable = new Serializable();
        object5 = ((HashMap)object5).values().iterator();
        while ((n3 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
            object4 = (Set)object5.next();
            serializable.addAll(object4);
        }
        return serializable;
    }
}

