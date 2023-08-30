package org.example;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-30T22:25:35+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class TestMapperImpl extends TestMapper {

    @Override
    public Test toEntity(TestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Test.TestBuilder test = Test.builder();

        test.name( dto.getName() );
        test.age( dto.getAge() );

        return test.build();
    }

    @Override
    public TestDto toDto(Test entity) {
        if ( entity == null ) {
            return null;
        }

        TestDto.TestDtoBuilder testDto = TestDto.builder();

        testDto.nameLength( toInt( entity.getName() ) );
        if ( entity.getAge() < 10 ) {
            testDto.age( entity.getAge() );
        }
        testDto.name( entity.getName() );

        return testDto.build();
    }
}
