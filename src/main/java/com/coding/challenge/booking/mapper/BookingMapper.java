package com.coding.challenge.booking.mapper;

import com.coding.challenge.booking.entity.BookingEntity;
import com.coding.challenge.booking.input.BookingInput;
import com.coding.challenge.booking.output.BookingOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class BookingMapper {

    public static final BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "version", ignore = true)
    public abstract BookingEntity mapInputToEntity(BookingInput input);

    @Mapping(source = "id", target = "bookingId")
    public abstract BookingOutput mapEntityToOutput(BookingEntity entity);
}
