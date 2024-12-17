$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1_Talkspace_Web_Tests/1_CreateBook.feature");
formatter.feature({
  "line": 1,
  "name": "E-Commerce Product Management.",
  "description": "",
  "id": "e-commerce-product-management.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Add a book or more to catalog Or Update an existing one.",
  "description": "",
  "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I login to the app with manager",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have a new product with \"\u003cname\u003e\" And \"\u003cprice\u003e\" And \"\u003ccategory\u003e\" And \"\u003cInventory\u003e\" And \"\u003cdiscount\u003e\" And \"\u003cweight\u003e\" And \"\u003ccolor\u003e\" And \"\u003cmanufacture\u003e\" And \"\u003cmoreAtr\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I check if the product exists through API Jsonfile \"\u003cname\u003e\" if not than create \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify the product exists in database \"Select \u003cname\u003e from Test1\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I check the product details via API \"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the product should be created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;",
  "rows": [
    {
      "cells": [
        "name",
        "price",
        "category",
        "Inventory",
        "discount",
        "weight",
        "color",
        "manufacture",
        "moreAtr"
      ],
      "line": 14,
      "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;;1"
    },
    {
      "cells": [
        "TestBook1",
        "29.99",
        "Books",
        "2",
        "20%",
        "20kg",
        "Black",
        "Moshe",
        "1,2,3,,4"
      ],
      "line": 15,
      "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;;2"
    },
    {
      "cells": [
        "TestBook2",
        "29.99",
        "Books",
        "2",
        "20%",
        "20kg",
        "Black",
        "Moshe",
        "1,2,3,,4"
      ],
      "line": 16,
      "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Add a book or more to catalog Or Update an existing one.",
  "description": "",
  "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I login to the app with manager",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have a new product with \"TestBook1\" And \"29.99\" And \"Books\" And \"2\" And \"20%\" And \"20kg\" And \"Black\" And \"Moshe\" And \"1,2,3,,4\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I check if the product exists through API Jsonfile \"TestBook1\" if not than create \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify the product exists in database \"Select TestBook1 from Test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I check the product details via API \"TestBook1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the product should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_login_to_the_app()"
});
formatter.result({
  "duration": 9618802200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook1",
      "offset": 27
    },
    {
      "val": "29.99",
      "offset": 43
    },
    {
      "val": "Books",
      "offset": 55
    },
    {
      "val": "2",
      "offset": 67
    },
    {
      "val": "20%",
      "offset": 75
    },
    {
      "val": "20kg",
      "offset": 85
    },
    {
      "val": "Black",
      "offset": 96
    },
    {
      "val": "Moshe",
      "offset": 108
    },
    {
      "val": "1,2,3,,4",
      "offset": 120
    }
  ],
  "location": "Steps.I_have_a_new_product_with(String,int,String,int,int,String,String,String,String)"
});
formatter.result({
  "duration": 4313100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook1",
      "offset": 52
    },
    {
      "val": "",
      "offset": 83
    }
  ],
  "location": "Steps.I_check_if_the_product_exists_through_API_if_not_than_create(String,String)"
});
formatter.result({
  "duration": 4778800,
  "error_message": "java.nio.file.NoSuchFileException: src\\main\\resources\\config\\DataForAPI_Tests\\TestBook1\r\n\tat java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:85)\r\n\tat java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)\r\n\tat java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:108)\r\n\tat java.base/sun.nio.fs.WindowsFileSystemProvider.newByteChannel(WindowsFileSystemProvider.java:235)\r\n\tat java.base/java.nio.file.Files.newByteChannel(Files.java:371)\r\n\tat java.base/java.nio.file.Files.newByteChannel(Files.java:422)\r\n\tat java.base/java.nio.file.Files.readAllBytes(Files.java:3206)\r\n\tat stepDefinition.Steps.I_check_if_the_product_exists_through_API_if_not_than_create(Steps.java:231)\r\n\tat ✽.When I check if the product exists through API Jsonfile \"TestBook1\" if not than create \"\"(1_Talkspace_Web_Tests/1_CreateBook.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select TestBook1 from Test1",
      "offset": 41
    }
  ],
  "location": "Steps.get_string_from_query(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook1",
      "offset": 37
    }
  ],
  "location": "Steps.check_product_ifnot_then_create(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.the_product_should_be_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Add a book or more to catalog Or Update an existing one.",
  "description": "",
  "id": "e-commerce-product-management.;add-a-book-or-more-to-catalog-or-update-an-existing-one.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I login to the app with manager",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I have a new product with \"TestBook2\" And \"29.99\" And \"Books\" And \"2\" And \"20%\" And \"20kg\" And \"Black\" And \"Moshe\" And \"1,2,3,,4\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I check if the product exists through API Jsonfile \"TestBook2\" if not than create \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify the product exists in database \"Select TestBook2 from Test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I check the product details via API \"TestBook2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the product should be created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_login_to_the_app()"
});
formatter.result({
  "duration": 8497530500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook2",
      "offset": 27
    },
    {
      "val": "29.99",
      "offset": 43
    },
    {
      "val": "Books",
      "offset": 55
    },
    {
      "val": "2",
      "offset": 67
    },
    {
      "val": "20%",
      "offset": 75
    },
    {
      "val": "20kg",
      "offset": 85
    },
    {
      "val": "Black",
      "offset": 96
    },
    {
      "val": "Moshe",
      "offset": 108
    },
    {
      "val": "1,2,3,,4",
      "offset": 120
    }
  ],
  "location": "Steps.I_have_a_new_product_with(String,int,String,int,int,String,String,String,String)"
});
formatter.result({
  "duration": 205100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook2",
      "offset": 52
    },
    {
      "val": "",
      "offset": 83
    }
  ],
  "location": "Steps.I_check_if_the_product_exists_through_API_if_not_than_create(String,String)"
});
formatter.result({
  "duration": 384300,
  "error_message": "java.nio.file.NoSuchFileException: src\\main\\resources\\config\\DataForAPI_Tests\\TestBook2\r\n\tat java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:85)\r\n\tat java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)\r\n\tat java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:108)\r\n\tat java.base/sun.nio.fs.WindowsFileSystemProvider.newByteChannel(WindowsFileSystemProvider.java:235)\r\n\tat java.base/java.nio.file.Files.newByteChannel(Files.java:371)\r\n\tat java.base/java.nio.file.Files.newByteChannel(Files.java:422)\r\n\tat java.base/java.nio.file.Files.readAllBytes(Files.java:3206)\r\n\tat stepDefinition.Steps.I_check_if_the_product_exists_through_API_if_not_than_create(Steps.java:231)\r\n\tat ✽.When I check if the product exists through API Jsonfile \"TestBook2\" if not than create \"\"(1_Talkspace_Web_Tests/1_CreateBook.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select TestBook2 from Test1",
      "offset": 41
    }
  ],
  "location": "Steps.get_string_from_query(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "TestBook2",
      "offset": 37
    }
  ],
  "location": "Steps.check_product_ifnot_then_create(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.the_product_should_be_created_successfully()"
});
formatter.result({
  "status": "skipped"
});
});