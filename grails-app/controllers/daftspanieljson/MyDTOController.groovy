package daftspanieljson

import com.myapp.dto.MyDTO

class MyDTOController {
    static responseFormats = ['json', 'xml']

    def index() {
        def data = [new MyDTO(afield: 'MY EXPECTED OBJECT 1 DATA'),
                    new MyDTO(afield: 'MY EXPECTED OBJECT 2 DATA')]

        respond data
    }
}
