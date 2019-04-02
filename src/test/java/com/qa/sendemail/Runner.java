package com.qa.sendemail;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.sendemail.booking.BookingEntityTests;
import com.qa.sendemail.employee.EmployeeEntityTest;
import com.qa.sendemail.room.RoomEntityTest;
import com.qa.sendemail.service.ServiceTests;
import com.qa.sendemail.ConstantTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BookingEntityTests.class,
   RoomEntityTest.class,
   EmployeeEntityTest.class,
   ServiceTests.class,
   ConstantTest.class,

   
})

public class Runner {

}
