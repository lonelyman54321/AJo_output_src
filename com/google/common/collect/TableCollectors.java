/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable$Builder;
import com.google.common.collect.Table;
import com.google.common.collect.Table$Cell;
import com.google.common.collect.TableCollectors$ImmutableTableCollectorState;
import com.google.common.collect.l;
import com.google.common.collect.m;
import com.google.common.collect.n;
import com.google.common.collect.o;
import com.google.common.collect.p;
import com.google.common.collect.q;
import com.google.common.collect.r;
import com.google.common.collect.s;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

final class TableCollectors {
    private TableCollectors() {
    }

    public static /* synthetic */ void a(Function function, Function function2, Function function3, BinaryOperator binaryOperator, TableCollectors$ImmutableTableCollectorState tableCollectors$ImmutableTableCollectorState, Object object) {
        TableCollectors.lambda$toImmutableTable$2(function, function2, function3, binaryOperator, tableCollectors$ImmutableTableCollectorState, object);
    }

    public static /* synthetic */ Object b(Object object, Object object2) {
        return TableCollectors.lambda$toTable$5(object, object2);
    }

    public static /* synthetic */ void c(Function function, Function function2, Function function3, BinaryOperator binaryOperator, Table table, Object object) {
        TableCollectors.lambda$toTable$6(function, function2, function3, binaryOperator, table, object);
    }

    public static /* synthetic */ ImmutableTable d(TableCollectors$ImmutableTableCollectorState tableCollectors$ImmutableTableCollectorState) {
        return tableCollectors$ImmutableTableCollectorState.toTable();
    }

    public static /* synthetic */ TableCollectors$ImmutableTableCollectorState e(BinaryOperator binaryOperator, TableCollectors$ImmutableTableCollectorState tableCollectors$ImmutableTableCollectorState, TableCollectors$ImmutableTableCollectorState tableCollectors$ImmutableTableCollectorState2) {
        return tableCollectors$ImmutableTableCollectorState.combine(tableCollectors$ImmutableTableCollectorState2, binaryOperator);
    }

    public static /* synthetic */ TableCollectors$ImmutableTableCollectorState f() {
        return tableCollectors$ImmutableTableCollectorState = new TableCollectors$ImmutableTableCollectorState(null);
    }

    public static /* synthetic */ Table g(BinaryOperator binaryOperator, Table table, Table table2) {
        return TableCollectors.lambda$toTable$7(binaryOperator, table, table2);
    }

    public static /* synthetic */ void h(Function function, Function function2, Function function3, ImmutableTable$Builder immutableTable$Builder, Object object) {
        TableCollectors.lambda$toImmutableTable$0(function, function2, function3, immutableTable$Builder, object);
    }

    private static /* synthetic */ void lambda$toImmutableTable$0(Function object, Function object2, Function object3, ImmutableTable$Builder immutableTable$Builder, Object object4) {
        object = fw0_0.a(object4, (Function)object);
        object2 = fw0_0.a(object4, (Function)object2);
        object3 = fw0_0.a(object4, (Function)object3);
        immutableTable$Builder.put(object, object2, object3);
    }

    private static /* synthetic */ void lambda$toImmutableTable$2(Function object, Function object2, Function object3, BinaryOperator binaryOperator, TableCollectors$ImmutableTableCollectorState tableCollectors$ImmutableTableCollectorState, Object object4) {
        object = fw0_0.a(object4, (Function)object);
        object2 = fw0_0.a(object4, (Function)object2);
        object3 = fw0_0.a(object4, (Function)object3);
        tableCollectors$ImmutableTableCollectorState.put(object, object2, object3, binaryOperator);
    }

    private static /* synthetic */ Object lambda$toTable$5(Object object, Object object2) {
        StringBuilder stringBuilder = new StringBuilder("Conflicting values ");
        stringBuilder.append(object);
        stringBuilder.append(" and ");
        stringBuilder.append(object2);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    private static /* synthetic */ void lambda$toTable$6(Function object, Function object2, Function object3, BinaryOperator binaryOperator, Table table, Object object4) {
        object = fw0_0.a(object4, (Function)object);
        object2 = fw0_0.a(object4, (Function)object2);
        object3 = fw0_0.a(object4, (Function)object3);
        TableCollectors.mergeTables(table, object, object2, object3, binaryOperator);
    }

    private static /* synthetic */ Table lambda$toTable$7(BinaryOperator binaryOperator, Table table, Table object) {
        boolean bl2;
        object = object.cellSet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Table$Cell)object.next();
            Object object3 = object2.getRowKey();
            Object object4 = object2.getColumnKey();
            object2 = object2.getValue();
            TableCollectors.mergeTables(table, object3, object4, object2, binaryOperator);
        }
        return table;
    }

    private static void mergeTables(Table table, Object object, Object object2, Object object3, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(object3);
        Object object4 = table.get(object, object2);
        if (object4 == null) {
            table.put(object, object2, object3);
        } else if ((object3 = fi3_2.a(binaryOperator, object4, object3)) == null) {
            table.remove(object, object2);
        } else {
            table.put(object, object2, object3);
        }
    }

    public static Collector toImmutableTable(Function object, Function function, Function characteristicsArray) {
        Preconditions.checkNotNull(object, "rowFunction");
        Preconditions.checkNotNull(function, "columnFunction");
        Preconditions.checkNotNull(characteristicsArray, "valueFunction");
        ii3_2 ii3_22 = new Object();
        m m2 = new m((Function)object, function, (Function)characteristicsArray);
        object = new Object();
        function = new fj1_0(1);
        characteristicsArray = new Collector.Characteristics[]{};
        return hi3_2.a(ii3_22, m2, (ji3_2)object, (fj1_0)function, characteristicsArray);
    }

    public static Collector toImmutableTable(Function object, Function function, Function characteristicsArray, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(object, "rowFunction");
        Preconditions.checkNotNull(function, "columnFunction");
        Preconditions.checkNotNull(characteristicsArray, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        q q2 = new Object();
        r r5 = new r((Function)object, function, (Function)characteristicsArray, binaryOperator);
        object = new s(binaryOperator);
        function = new Object();
        characteristicsArray = new Collector.Characteristics[]{};
        return gi3_2.a(q2, r5, (s)object, (l)function, characteristicsArray);
    }

    public static Collector toTable(Function object, Function characteristicsArray, Function function, BinaryOperator binaryOperator, Supplier supplier) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(characteristicsArray);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        o o3 = new o((Function)object, (Function)characteristicsArray, function, binaryOperator);
        object = new p(binaryOperator);
        characteristicsArray = new Collector.Characteristics[]{};
        return ei3_2.a(supplier, o3, (p)object, characteristicsArray);
    }

    public static Collector toTable(Function function, Function function2, Function function3, Supplier supplier) {
        n n3 = new Object();
        return TableCollectors.toTable(function, function2, function3, n3, supplier);
    }
}

