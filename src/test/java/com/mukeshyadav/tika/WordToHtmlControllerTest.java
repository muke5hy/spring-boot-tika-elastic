package com.mukeshyadav.tika;

import com.mukeshyadav.tika.WordToHtmlConverter;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;

//@RunWith(NestedRunner.class)
public class WordToHtmlControllerTest {

//    private MockMvc mockMvc;

    private WordToHtmlConverter converter;

    @Before
    public void setUp() {
        converter = mock(WordToHtmlConverter.class);

//        mockMvc = MockMvcBuilders.standaloneSetup(new WordToHtmlController(converter))
//                .build();
    }

    public class ConvertWordDocumentIntoHtmlDocument {

        private final String DOCUMENT_CONTENT = "word document content";
        private final String DOCUMENT_AS_HTML = "<html><body>Hello World!</body></html>";
        private final String FILENAME = "helloworld.docx";

        @Before
        public void returnDocumentAsHtml() {
//            given(converter.convertWordDocumentIntoHtml(isA(MockMultipartFile.class))).willReturn(
//                    new ConvertedDocumentDTO(FILENAME, DOCUMENT_AS_HTML)
//            );
        }

        @Test
        public void shouldReturnResponseStatusOk() throws Exception {
//            mockMvc.perform(fileUpload("/api/word-to-html")
//                            .file(WebTestConstants.REQUEST_PARAM_NAME_FILE, DOCUMENT_CONTENT.getBytes())
//            )
//                    .andExpect(status().isOk());
        }

        @Test
        public void shouldReturnHtmlDocumentAsJson() throws Exception {
//            mockMvc.perform(fileUpload("/api/word-to-html")
//                            .file(WebTestConstants.REQUEST_PARAM_NAME_FILE, DOCUMENT_CONTENT.getBytes())
//            )
//                    .andExpect(content().contentType(WebTestConstants.APPLICATION_JSON_UTF8))
//                    .andExpect(jsonPath("$.filename", is(FILENAME)))
//                    .andExpect(jsonPath("$.contentAsHtml", is(DOCUMENT_AS_HTML)));
//
        }
    }
}
