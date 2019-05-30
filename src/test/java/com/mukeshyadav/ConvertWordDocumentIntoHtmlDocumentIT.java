package com.mukeshyadav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


public class ConvertWordDocumentIntoHtmlDocumentIT {

    private static final String FILENAME_HELLO_WORLD = "helloworld.docx";
    private static final String FILE_PATH_HELLO_WORLD = "/fi/vincit/springboot/wordtohtml/helloworld.docx";

    @Autowired
    WebApplicationContext webApplicationContext;

//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
//                .build();
//    }
//
//    @Test
//    public void convertWordDocumentIntoHtmlDocument_ShouldReturnResponseStatusOk() throws Exception {
//        MockMultipartFile wordDocument = createMultipartFile(FILENAME_HELLO_WORLD, FILE_PATH_HELLO_WORLD);
//        mockMvc.perform(fileUpload("/api/word-to-html")
//                .file(wordDocument)
//        )
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void convertWordDocumentIntoHtmlDocument_HelloWorldDocument_ShouldReturnJsonDocument() throws Exception {
//        MockMultipartFile wordDocument = createMultipartFile(FILENAME_HELLO_WORLD, FILE_PATH_HELLO_WORLD);
//        mockMvc.perform(fileUpload("/api/word-to-html")
//                        .file(wordDocument)
//        )
//                .andExpect(content().contentType(WebTestConstants.APPLICATION_JSON_UTF8));
//    }
//
//    @Test
//    public void convertWordDocumentIntoHtmlDocument_HelloWorldDocument_ShouldReturnFilenameOfUploadedWordDocument() throws Exception {
//        MockMultipartFile wordDocument = createMultipartFile(FILENAME_HELLO_WORLD, FILE_PATH_HELLO_WORLD);
//        mockMvc.perform(fileUpload("/api/word-to-html")
//                        .file(wordDocument)
//        )
//                .andExpect(jsonPath("$.filename", is(FILENAME_HELLO_WORLD)));
//    }
//
//    private MockMultipartFile createMultipartFile(String fileName, String filePath) throws IOException {
//        InputStream in = this.getClass().getResourceAsStream(filePath);
//        return new MockMultipartFile(WebTestConstants.REQUEST_PARAM_NAME_FILE,
//                fileName,
//                "",
//                in
//        );
//    }
}
