package com.manifestcorp.techreads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;
@Component public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    protected BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(bookRepository.count() < 3 ) {
            bookRepository.save(new Book("Beginning Groovy and Grails",-6.9,"Christopher Judd","https://th.bing.com/th/id/OIP.ZX0O1Jm7jLgOxCQfaiGVcwHaLL?w=196&h=296&c=7&r=0&o=5&dpr=2&pid=1.7"));
            bookRepository.save(new Book("Pro Eclipse JST",9.8,"me","https://th.bing.com/th/id/OIP.86saHbx18iltkDCl1G6OSgHaLJ?w=196&h=295&c=7&r=0&o=5&dpr=2&pid=1.7"));
            bookRepository.save(new Book("Enterprise Java Development on a Budget",50,"sht earnest","https://th.bing.com/th/id/OIP.AirxOQvjchFvEZTtHD0IwQHaKe?w=196&h=277&c=7&r=0&o=5&dpr=2&pid=1.7"));
        }
    }
}
