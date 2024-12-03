<!DOCTYPE html>
<html>
<head>
    <title>Search Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .search-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        .search-container h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
            color: #555;
        }
        input[type="search"], button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
        .radio-group {
            margin-bottom: 15px;
        }
        .radio-group label {
            display: inline-block;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="search-container">
    <h2>Search Form</h2>
    <form action="Find" method="post">
        <label for="keyword">Search:</label>
        <input type="search" id="keyword" name="keyword" placeholder="Enter keyword..." required>

        <div class="radio-group">
            <label>Select Search Engine:</label><br>
            <input type="radio" id="google" name="searchEngine" value="Google" checked>
            <label for="google">Google</label>
            <input type="radio" id="bing" name="searchEngine" value="Bing">
            <label for="bing">Bing</label>
            <input type="radio" id="ask" name="searchEngine" value="ASK">
            <label for="ask">ASK</label>
        </div>

        <button type="submit">Search</button>
    </form>
</div>
</body>
</html>
