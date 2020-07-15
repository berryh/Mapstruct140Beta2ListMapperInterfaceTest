package net.berryh.mapstructbugtest;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class SourceTargetMapper implements ListConverter<SourceType, TargetType>
{
	public static final SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

	@Override
	public abstract SourceType toType(final TargetType source);

	@Override
	@InheritInverseConfiguration
	public abstract TargetType toTO(final SourceType source);
}
