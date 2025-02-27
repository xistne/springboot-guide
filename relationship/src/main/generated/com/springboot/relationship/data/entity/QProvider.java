package com.springboot.relationship.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProvider is a Querydsl query type for Provider
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProvider extends EntityPathBase<Provider> {

    private static final long serialVersionUID = -390244596L;

    public static final QProvider provider = new QProvider("provider");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QProvider(String variable) {
        super(Provider.class, forVariable(variable));
    }

    public QProvider(Path<? extends Provider> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProvider(PathMetadata metadata) {
        super(Provider.class, metadata);
    }

}

